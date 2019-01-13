package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.SerialPort.Port;

public class Robot extends TimedRobot {

  private SerialPort serialportkUSB1;
  private String serialString;

  @Override
  public void robotInit() {

    serialportkUSB1 = new SerialPort(115200, Port.kUSB1);
    
  }

  @Override
  public void teleopPeriodic() {

    serialString = serialportkUSB1.readString();
    System.out.println(serialString);

  }
}