package cricket;

import cricket.Match;

public class T20Match extends Match {
int r=0;
	@Override
	public float calculateRunRate() {
		// TODO Auto-generated method stub
		r=getTarget()-getCurrentscore();
		float b=20-getCurrentover();
		return r/b;
	}

	@Override
	public int calculateBalls() {
		// TODO Auto-generated method stub
		
		return (int) (6*(20-getCurrentover()));
	}

	@Override
	public void display(double reqRunrate, int balls) {
		// TODO Auto-generated method stub
		System.out.println("Need "+r+" runs in "+balls+" balls");
		System.out.println("Required Runrate:"+reqRunrate);
	}
}
