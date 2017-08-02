package neuralnet;
import java.io.File;

public interface CommonInterface {

	
	public double outputFor(double [] X);
	public double train(double [] X, double argValue);
	public void save(File argFile);
	public void load(String argFileName);
	

}
