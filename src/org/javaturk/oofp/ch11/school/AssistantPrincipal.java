package org.javaturk.oofp.ch11.school;

public class AssistantPrincipal extends Teacher{
	protected boolean priviledge;

	public AssistantPrincipal(int no, String name, String major, boolean priviledge) {
		super(no, name, major);
		this.priviledge = priviledge;
	}
	
	@Override
	public void work(){
		teach();
		sign();
	}
	
	@Override
	public void teach() {
		System.out.println("AssistantPrincipal is teaching.");
	}
	
	public void sign(){
		System.out.println("AssistantPrincipal is signing." );
	}

	public boolean isPriviledge() {
		return priviledge;
	}

	public void setPriviledge(boolean priviledge) {
		this.priviledge = priviledge;
	}

	@Override
	public String toString() {
		return "AssistantPrincipal [priviledge=" + priviledge + ", no=" + no + ", name=" + name + "]";
	}
}
