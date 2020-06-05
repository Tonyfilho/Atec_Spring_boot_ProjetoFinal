package pt.atec.blog.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import pt.atec.blog.service.UserService;

@Configuration
@EnableWebSecurity 
public class SecurityConfig extends WebSecurityConfigurerAdapter { //lista de pagina sem autenticação private
    static final String[] AUTH_LIST = {
        "/",
        "/blog",
        "/postatec",
        "/postatec/{id}",
        "/tpsi", 
        "/tpsi/{pagina}", 
        "/ciber", 
        "/ciber/{id}",
        "/redes", 
        "/redes/{id}", 
        "/mecatronica", 
        "/mecatronica/{id}", 
        "/robotica",
        "/robotica/{id}", 
        "/automoveis", 
        "/automoveis/{id}"
    };

	
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.csrf().disable().authorizeRequests().antMatchers(AUTH_LIST).permitAll()
	 * .anyRequest().authenticated().and().formLogin().permitAll()
	 * .and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")); }
	 */

	/*
	 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
	 * Exception { auth.inMemoryAuthentication()
	 * .withUser("guapo").password("{noop}123").roles("ADMIN");
	 * 
	 * }
	 */

	/*
	 * @Override public void configure(WebSecurity web) throws Exception {
	 * //web.ignoring().antMatchers("/bootstrap/**"); //
	 * web.ignoring().antMatchers("/bootstrap/**", "/style/**"); }
	 */
    
    
    @Autowired
    private UserService userService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        		.authorizeRequests()
        			.antMatchers(
        					"/registration**",
        					"/js/**",
        					"/css/**",
        					"/img/**",
        					"/webjars/**").permitAll()
        			.antMatchers(
        					AUTH_LIST).permitAll()
        			.anyRequest().authenticated()
                .and()
                    .formLogin()
                    	.loginProcessingUrl("/login")
                        .loginPage("/login")
                        .usernameParameter("username")
                        .passwordParameter("password")
                        .defaultSuccessUrl("/postatec", true)
                        .failureUrl("/login?error")
                    .permitAll()
                .and()
                    .logout()
                        .invalidateHttpSession(true)
                        .clearAuthentication(true)
                        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                        .logoutSuccessUrl("/login?logout")
                .permitAll();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
        auth.setUserDetailsService(userService);
        auth.setPasswordEncoder(passwordEncoder());
        return auth;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }

}