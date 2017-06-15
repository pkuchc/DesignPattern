package CreationalPattern.Prototype;

import java.io.Serializable;

public class Experience implements Serializable{ //经历类
	private String projectExperience=null;// 项目经历
	private String leaderExperience=null;//学生工作经历（领导力）
	
	public String getProjectExperience() {
		return projectExperience;
	}
	public void setProjectExperience(String projectExperience) {
		this.projectExperience = projectExperience;
	}
	public String getLeaderExperienc() {
		return leaderExperience;
	}
	public void setLeaderExperienc(String leaderExperience) {
		this.leaderExperience = leaderExperience;
	}
	

}
