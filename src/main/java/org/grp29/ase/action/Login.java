package org.grp29.ase.action;
import com.opensymphony.xwork2.ActionSupport;
import org.grp29.ase.model.User;
import org.grp29.ase.service.DataAccess;
import org.grp29.ase.service.MySqlDAO;

/**
 * Login Action Class
 * Defines our Login logic, handles the client request in the web
 * Prepares the response through our @execute() method
 */
public class Login extends ActionSupport {
    // Unique Identifier for Serializable classes
    private static final long serialVersionUID = 1L;
    
    private User userBean;
    private String username;
    private String password;
    private DataAccess dao;

    public String execute() throws Exception {
        // calls Service class to retrieve info in database
        dao = new MySqlDAO();
        userBean = dao.getUser(username, password);
        if (userBean == null) {
            return "login_failed";
        }
        else {
            return SUCCESS;
        }
        
    }

    public User getUserBean() {
		return this.userBean;
	}

	public void setUserBean(User userBean) {
		this.userBean = userBean;
	}

    public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    public void validate() {
        if (username.length() == 0) {
            addFieldError("username", "Username is required");
        }

        if (password.length() == 0) {
            addFieldError("password", "Password is required");
        }
    }
}