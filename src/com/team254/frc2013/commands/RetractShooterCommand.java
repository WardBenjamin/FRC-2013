package com.team254.frc2013.commands;

/**
 * Shoots a disc that is already loaded into the shooter.
 *
 * @author tom@team254.com (Tom Bottiglieri)
 * @author pat@team254.com (Patrick Fairbank)
 */
public class RetractShooterCommand extends CommandBase {
  public RetractShooterCommand() {
  }

  protected void initialize() {
    shooter.load();
  }

  protected void execute() {
  }

  protected boolean isFinished() {
    return true;
  }

  protected void end() {
  }

  protected void interrupted() {
  }
}
