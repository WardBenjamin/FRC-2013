package com.team254.frc2013.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

/**
 * Controls the first-stage hanger hook
 *
 * @author richard@team254.com (Richard Lin)
 */
public class HangerHookCommand extends CommandBase {

  boolean up = true;

  public HangerHookCommand(boolean up) {
    System.out.println("New hanger hook command");
    this.up = up;
    requires(hanger);
  }

  protected void initialize() {
  }

  protected void execute() {
    if(up)
      hanger.setHookUp(hanger.HANGER_HOOK_EXTENDED);
    else
      hanger.setHookUp(hanger.HANGER_HOOK_RETRACTED);
  }

  protected boolean isFinished() {
    return true;
  }

  protected void end() {
    hanger.setHookUp(hanger.HANGER_HOOK_FLOATING);
    //May need to change
  }

  protected void interrupted() {
  }

}
