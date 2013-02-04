package com.team254.frc2013.commands.auto;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 * @author tom@team254.com (Tom Bottiglieri)
 */
public class WaitCommand extends Command {
  double timeout;

  public WaitCommand(double seconds) {
    timeout = seconds;
  }
  protected void initialize() {
    setTimeout(timeout);
  }

  protected void execute() {
    System.out.println("Waiting...");
  }

  protected boolean isFinished() {
    return isTimedOut();
  }

  protected void end() {
  }

  protected void interrupted() {
  }

}
