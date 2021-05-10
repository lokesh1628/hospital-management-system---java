package HACKATHON;

public interface PuserDAO {
	public int insertPatients(Puser p);
	public Puser getPatients(String userid,String pass);

}
