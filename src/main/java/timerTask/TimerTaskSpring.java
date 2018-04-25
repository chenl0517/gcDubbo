package timerTask;

import java.util.Timer;
import java.util.TimerTask;

import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.timer.TimerTaskExecutor;
import org.springframework.stereotype.Component;

public class TimerTaskSpring {
	public static void main(String[] args) {
		
		TimerTaskExecutor te=new TimerTaskExecutor();
		
		Timer timer=new Timer();
		
		te.setTimer(timer);
		
		//te.setDelay(2000);
		
		//for(int i=0;i<100000000;i++){
		//	System.out.println("循环第："+i+"次=======");
		TimerTask task=new myTimer();
		te.execute(task);
		
		//}
	}

}

@Component
class myTimer extends TimerTask{
	
	
	@Override
	public void run() {
		//获取
		  System.out.println("aaa");
	}
	
}
