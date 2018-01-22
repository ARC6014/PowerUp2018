/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6014.robot;

import org.usfirst.frc.team6014.robot.utility.SpeedControllerEnum;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

public class RobotMap {
	//PWM PORTS
	//Drive
	public static int frontLeft = 0;
	public static SpeedControllerEnum frontLeftEnum = SpeedControllerEnum.VICTORSP;
	
	public static int rearLeft = 1;
	public static SpeedControllerEnum rearLeftEnum = SpeedControllerEnum.VICTORSP;
	
	public static int frontRight = 2;
	public static SpeedControllerEnum frontRightEnum = SpeedControllerEnum.SPARK;
	
	public static int rearRight = 3;
	public static SpeedControllerEnum rearRightEnum = SpeedControllerEnum.VICTORSP;
	//Arm
	//Ramp
	public static int leftRamp = 4;
	public static SpeedControllerEnum leftRampEnum = SpeedControllerEnum.VICTORSPX;
	
	public static int rightRamp = 5;
	public static SpeedControllerEnum rightRampEnum = SpeedControllerEnum.VICTORSPX;
	
	public static int release = 6;
	public static SpeedControllerEnum releaseEnum = SpeedControllerEnum.VICTORSPX;
	/*
	* arm kısmını yaptıktan sonra 4,5,6 numaralarını kaydırırız.
	*/
}
