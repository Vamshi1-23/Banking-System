package Techwave.Bank.model.pojo;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="b_login")
public class login {

	@Id
	 @Column(length = 20)
    private int userId;
	
    @Column(length = 20)
    private int password;
    
    public login() {
		
    	 super();
	}
       
  
    public login(int password, int userId) {
        super();
        this.password = password;
        this.userId = userId;
    }
    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}
   
    
    
}
