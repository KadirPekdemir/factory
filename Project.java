import java.text.SimpleDateFormat;
import java.util.Calendar;
//Kadir PEKDEMÝR 150121069

public class Project {
	private String projectName;
	private java.util.Calendar startDate;
	private boolean state;
	SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");
	public Project(String projectName, Calendar startDate,String state) {
		this.projectName = projectName;
		this.startDate = startDate;
		this.state = returnstate(state);
		
	}
	public Project() {
		
	}
	public boolean returnstate(String state) {
		if (state.equals("Open")) {
			this.state=true;
		}
		else if(state.equals("Close")) {
			this.state=false;
		}
		return this.state;
	}
	public void setState(String state) {
		if (state.equals("Open")) {
			this.state=true;
		}
		else if(state.equals("Close")) {
			this.state=false;
		}
	}
	public String getState() {
		String statee="";
		if(state)
			statee="true";
		else
			statee="false";
		return statee;
	}
	public void close(String state) {
		if (state=="Open") {
			state="Close";
		}
	}
	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", startDate=" + sdf.format(startDate.getTime()) + ", state=" + getState() + "]";
	}
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public java.util.Calendar getStartDate() {
		return startDate;
	}
	public void setStartDate(java.util.Calendar startDate) {
		this.startDate = startDate;
	}
	
}
