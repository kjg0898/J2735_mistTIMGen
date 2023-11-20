/*************************************************************/
/* Copyright (C) 2023 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED.
 * THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED. */

/* Generated for: Neighbor System, Site-based, License 17353 17353,
 * at 16th Fl. IT Venture Tower (East), 135, Jungdae-ro, Songpa-Gu, Seoul 05717, Korea. */
/* Abstract syntax: j2735_cits_20201125 */
/* ASN.1 Java project: dsrc.Dsrc */
/* Created: Wed Jul 12 11:40:42 2023 */
/* ASN.1 Compiler for Java version: 7.2 */
/* ASN.1 compiler options and file names specified:
 * -output dsrc -nouniquepdu -per -uper -ber -der -cer -json -root
 * -pdusforopentypes -messageFormat msvc
 * D:/OSS_ASN1/Project/POLICE/J2735_CITS_20201125.asn
 * C:/Users/Administrator/AppData/Local/Temp/2/asn1studio.Administrator.9592/ossSamplePOLICE/J2735_CITS_20201125.asn
 */


package dsrc.dsrc;

import com.oss.asn1.AbstractData;
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type VehicleStatus from ASN1 Module DSRC.
 * @see Sequence
 */

public class VehicleStatus extends Sequence {
    
    /**
     * The default constructor.
     */
    public VehicleStatus()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public VehicleStatus(ExteriorLights lights, LightbarInUse lightBar, 
		    WiperSet wipers, BrakeSystemStatus brakeStatus, 
		    BrakeAppliedPressure brakePressure, 
		    CoefficientOfFriction roadFriction, SunSensor sunData, 
		    RainSensor rainData, AmbientAirTemperature airTemp, 
		    AmbientAirPressure airPres, Steering steering, 
		    AccelSets accelSets, Object object, 
		    FullPositionVector fullPos, ThrottlePosition throttlePos, 
		    SpeedandHeadingandThrottleConfidence speedHeadC, 
		    SpeedConfidence speedC, VehicleData vehicleData, 
		    VehicleIdent vehicleIdent, J1939data j1939data, 
		    WeatherReport weatherReport, GNSSstatus gnssStatus)
    {
	setLights(lights);
	setLightBar(lightBar);
	setWipers(wipers);
	setBrakeStatus(brakeStatus);
	setBrakePressure(brakePressure);
	setRoadFriction(roadFriction);
	setSunData(sunData);
	setRainData(rainData);
	setAirTemp(airTemp);
	setAirPres(airPres);
	setSteering(steering);
	setAccelSets(accelSets);
	setObject(object);
	setFullPos(fullPos);
	setThrottlePos(throttlePos);
	setSpeedHeadC(speedHeadC);
	setSpeedC(speedC);
	setVehicleData(vehicleData);
	setVehicleIdent(vehicleIdent);
	setJ1939data(j1939data);
	setWeatherReport(weatherReport);
	setGnssStatus(gnssStatus);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ExteriorLights();
	mComponents[1] = LightbarInUse.unavailable;
	mComponents[2] = new WiperSet();
	mComponents[3] = new BrakeSystemStatus();
	mComponents[4] = BrakeAppliedPressure.unavailable;
	mComponents[5] = new CoefficientOfFriction();
	mComponents[6] = new SunSensor();
	mComponents[7] = RainSensor.none;
	mComponents[8] = new AmbientAirTemperature();
	mComponents[9] = new AmbientAirPressure();
	mComponents[10] = new Steering();
	mComponents[11] = new AccelSets();
	mComponents[12] = new Object();
	mComponents[13] = new FullPositionVector();
	mComponents[14] = new ThrottlePosition();
	mComponents[15] = new SpeedandHeadingandThrottleConfidence();
	mComponents[16] = SpeedConfidence.unavailable;
	mComponents[17] = new VehicleData();
	mComponents[18] = new VehicleIdent();
	mComponents[19] = new J1939data();
	mComponents[20] = new WeatherReport();
	mComponents[21] = new GNSSstatus();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[22];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new ExteriorLights();
	    case 1:
		return LightbarInUse.unavailable;
	    case 2:
		return new WiperSet();
	    case 3:
		return new BrakeSystemStatus();
	    case 4:
		return BrakeAppliedPressure.unavailable;
	    case 5:
		return new CoefficientOfFriction();
	    case 6:
		return new SunSensor();
	    case 7:
		return RainSensor.none;
	    case 8:
		return new AmbientAirTemperature();
	    case 9:
		return new AmbientAirPressure();
	    case 10:
		return new Steering();
	    case 11:
		return new AccelSets();
	    case 12:
		return new Object();
	    case 13:
		return new FullPositionVector();
	    case 14:
		return new ThrottlePosition();
	    case 15:
		return new SpeedandHeadingandThrottleConfidence();
	    case 16:
		return SpeedConfidence.unavailable;
	    case 17:
		return new VehicleData();
	    case 18:
		return new VehicleIdent();
	    case 19:
		return new J1939data();
	    case 20:
		return new WeatherReport();
	    case 21:
		return new GNSSstatus();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "lights"
    public ExteriorLights getLights()
    {
	return (ExteriorLights)mComponents[0];
    }
    
    public void setLights(ExteriorLights lights)
    {
	mComponents[0] = lights;
    }
    
    public boolean hasLights()
    {
	return componentIsPresent(0);
    }
    
    public void deleteLights()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "lightBar"
    public LightbarInUse getLightBar()
    {
	return (LightbarInUse)mComponents[1];
    }
    
    public void setLightBar(LightbarInUse lightBar)
    {
	mComponents[1] = lightBar;
    }
    
    public boolean hasLightBar()
    {
	return componentIsPresent(1);
    }
    
    public void deleteLightBar()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "wipers"
    public WiperSet getWipers()
    {
	return (WiperSet)mComponents[2];
    }
    
    public void setWipers(WiperSet wipers)
    {
	mComponents[2] = wipers;
    }
    
    public boolean hasWipers()
    {
	return componentIsPresent(2);
    }
    
    public void deleteWipers()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "brakeStatus"
    public BrakeSystemStatus getBrakeStatus()
    {
	return (BrakeSystemStatus)mComponents[3];
    }
    
    public void setBrakeStatus(BrakeSystemStatus brakeStatus)
    {
	mComponents[3] = brakeStatus;
    }
    
    public boolean hasBrakeStatus()
    {
	return componentIsPresent(3);
    }
    
    public void deleteBrakeStatus()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "brakePressure"
    public BrakeAppliedPressure getBrakePressure()
    {
	return (BrakeAppliedPressure)mComponents[4];
    }
    
    public void setBrakePressure(BrakeAppliedPressure brakePressure)
    {
	mComponents[4] = brakePressure;
    }
    
    public boolean hasBrakePressure()
    {
	return componentIsPresent(4);
    }
    
    public void deleteBrakePressure()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "roadFriction"
    public CoefficientOfFriction getRoadFriction()
    {
	return (CoefficientOfFriction)mComponents[5];
    }
    
    public void setRoadFriction(CoefficientOfFriction roadFriction)
    {
	mComponents[5] = roadFriction;
    }
    
    public boolean hasRoadFriction()
    {
	return componentIsPresent(5);
    }
    
    public void deleteRoadFriction()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "sunData"
    public SunSensor getSunData()
    {
	return (SunSensor)mComponents[6];
    }
    
    public void setSunData(SunSensor sunData)
    {
	mComponents[6] = sunData;
    }
    
    public boolean hasSunData()
    {
	return componentIsPresent(6);
    }
    
    public void deleteSunData()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "rainData"
    public RainSensor getRainData()
    {
	return (RainSensor)mComponents[7];
    }
    
    public void setRainData(RainSensor rainData)
    {
	mComponents[7] = rainData;
    }
    
    public boolean hasRainData()
    {
	return componentIsPresent(7);
    }
    
    public void deleteRainData()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "airTemp"
    public AmbientAirTemperature getAirTemp()
    {
	return (AmbientAirTemperature)mComponents[8];
    }
    
    public void setAirTemp(AmbientAirTemperature airTemp)
    {
	mComponents[8] = airTemp;
    }
    
    public boolean hasAirTemp()
    {
	return componentIsPresent(8);
    }
    
    public void deleteAirTemp()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "airPres"
    public AmbientAirPressure getAirPres()
    {
	return (AmbientAirPressure)mComponents[9];
    }
    
    public void setAirPres(AmbientAirPressure airPres)
    {
	mComponents[9] = airPres;
    }
    
    public boolean hasAirPres()
    {
	return componentIsPresent(9);
    }
    
    public void deleteAirPres()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "steering"
    public Steering getSteering()
    {
	return (Steering)mComponents[10];
    }
    
    public void setSteering(Steering steering)
    {
	mComponents[10] = steering;
    }
    
    public boolean hasSteering()
    {
	return componentIsPresent(10);
    }
    
    public void deleteSteering()
    {
	setComponentAbsent(10);
    }
    
    
    
    /**
     * Define the ASN1 Type Steering from ASN1 Module DSRC.
     * @see Sequence
     */
    public static class Steering extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Steering()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Steering(SteeringWheelAngle angle, 
			SteeringWheelAngleConfidence confidence, 
			SteeringWheelAngleRateOfChange rate, 
			DrivingWheelAngle wheels)
	{
	    setAngle(angle);
	    setConfidence(confidence);
	    setRate(rate);
	    setWheels(wheels);
	}
	
	/**
	 * Construct with required components.
	 */
	public Steering(SteeringWheelAngle angle)
	{
	    setAngle(angle);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SteeringWheelAngle();
	    mComponents[1] = SteeringWheelAngleConfidence.unavailable;
	    mComponents[2] = new SteeringWheelAngleRateOfChange();
	    mComponents[3] = new DrivingWheelAngle();
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[4];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return new SteeringWheelAngle();
		case 1:
		    return SteeringWheelAngleConfidence.unavailable;
		case 2:
		    return new SteeringWheelAngleRateOfChange();
		case 3:
		    return new DrivingWheelAngle();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "angle"
	public SteeringWheelAngle getAngle()
	{
	    return (SteeringWheelAngle)mComponents[0];
	}
	
	public void setAngle(SteeringWheelAngle angle)
	{
	    mComponents[0] = angle;
	}
	
	
	// Methods for field "confidence"
	public SteeringWheelAngleConfidence getConfidence()
	{
	    return (SteeringWheelAngleConfidence)mComponents[1];
	}
	
	public void setConfidence(SteeringWheelAngleConfidence confidence)
	{
	    mComponents[1] = confidence;
	}
	
	public boolean hasConfidence()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteConfidence()
	{
	    setComponentAbsent(1);
	}
	
	
	// Methods for field "rate"
	public SteeringWheelAngleRateOfChange getRate()
	{
	    return (SteeringWheelAngleRateOfChange)mComponents[2];
	}
	
	public void setRate(SteeringWheelAngleRateOfChange rate)
	{
	    mComponents[2] = rate;
	}
	
	public boolean hasRate()
	{
	    return componentIsPresent(2);
	}
	
	public void deleteRate()
	{
	    setComponentAbsent(2);
	}
	
	
	// Methods for field "wheels"
	public DrivingWheelAngle getWheels()
	{
	    return (DrivingWheelAngle)mComponents[3];
	}
	
	public void setWheels(DrivingWheelAngle wheels)
	{
	    mComponents[3] = wheels;
	}
	
	public boolean hasWheels()
	{
	    return componentIsPresent(3);
	}
	
	public void deleteWheels()
	{
	    setComponentAbsent(3);
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x800a
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"VehicleStatus$Steering"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
	    ),
	    274450,
	    null,
	    new FieldsDict (
		new SequenceFieldInfo[] {
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "SteeringWheelAngle"
				),
				new QName (
				    "DSRC",
				    "SteeringWheelAngle"
				),
				274450,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new SteeringWheelAngle(-126), 
					new SteeringWheelAngle(127),
					0
				    )
				),
				new Bounds (
				    Long.valueOf(-126),
				    Long.valueOf(127)
				),
				null
			    )
			),
			"angle",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "SteeringWheelAngleConfidence"
				),
				new QName (
				    "DSRC",
				    "SteeringWheelAngleConfidence"
				),
				274450,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "unavailable",
					    0
					),
					new MemberListElement (
					    "prec2deg",
					    1
					),
					new MemberListElement (
					    "prec1deg",
					    2
					),
					new MemberListElement (
					    "prec0-02deg",
					    3
					)
				    }
				),
				0,
				SteeringWheelAngleConfidence.unavailable
			    )
			),
			"confidence",
			1,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8002
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "SteeringWheelAngleRateOfChange"
				),
				new QName (
				    "DSRC",
				    "SteeringWheelAngleRateOfChange"
				),
				274450,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new SteeringWheelAngleRateOfChange(-127), 
					new SteeringWheelAngleRateOfChange(127),
					0
				    )
				),
				new Bounds (
				    Long.valueOf(-127),
				    Long.valueOf(127)
				),
				null
			    )
			),
			"rate",
			2,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8003
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "DrivingWheelAngle"
				),
				new QName (
				    "DSRC",
				    "DrivingWheelAngle"
				),
				274450,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new DrivingWheelAngle(-128), 
					new DrivingWheelAngle(127),
					0
				    )
				),
				new Bounds (
				    Long.valueOf(-128),
				    Long.valueOf(127)
				),
				null
			    )
			),
			"wheels",
			3,
			3,
			null
		    )
		}
	    ),
	    0,
	    new TagDecoders (
		new TagDecoder[] {
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8000, 0)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8001, 1),
			    new TagDecoderElement((short)0x8002, 2),
			    new TagDecoderElement((short)0x8003, 3)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8002, 2),
			    new TagDecoderElement((short)0x8003, 3)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8003, 3)
			}
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Steering object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Steering object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Steering

    // Methods for field "accelSets"
    public AccelSets getAccelSets()
    {
	return (AccelSets)mComponents[11];
    }
    
    public void setAccelSets(AccelSets accelSets)
    {
	mComponents[11] = accelSets;
    }
    
    public boolean hasAccelSets()
    {
	return componentIsPresent(11);
    }
    
    public void deleteAccelSets()
    {
	setComponentAbsent(11);
    }
    
    
    
    /**
     * Define the ASN1 Type AccelSets from ASN1 Module DSRC.
     * @see Sequence
     */
    public static class AccelSets extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public AccelSets()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public AccelSets(AccelerationSet4Way accel4way, 
			VerticalAccelerationThreshold vertAccelThres, 
			YawRateConfidence yawRateCon, 
			AccelerationConfidence hozAccelCon, 
			ConfidenceSet confidenceSet)
	{
	    setAccel4way(accel4way);
	    setVertAccelThres(vertAccelThres);
	    setYawRateCon(yawRateCon);
	    setHozAccelCon(hozAccelCon);
	    setConfidenceSet(confidenceSet);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new AccelerationSet4Way();
	    mComponents[1] = new VerticalAccelerationThreshold();
	    mComponents[2] = YawRateConfidence.unavailable;
	    mComponents[3] = AccelerationConfidence.unavailable;
	    mComponents[4] = new ConfidenceSet();
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[5];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return new AccelerationSet4Way();
		case 1:
		    return new VerticalAccelerationThreshold();
		case 2:
		    return YawRateConfidence.unavailable;
		case 3:
		    return AccelerationConfidence.unavailable;
		case 4:
		    return new ConfidenceSet();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "accel4way"
	public AccelerationSet4Way getAccel4way()
	{
	    return (AccelerationSet4Way)mComponents[0];
	}
	
	public void setAccel4way(AccelerationSet4Way accel4way)
	{
	    mComponents[0] = accel4way;
	}
	
	public boolean hasAccel4way()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteAccel4way()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "vertAccelThres"
	public VerticalAccelerationThreshold getVertAccelThres()
	{
	    return (VerticalAccelerationThreshold)mComponents[1];
	}
	
	public void setVertAccelThres(VerticalAccelerationThreshold vertAccelThres)
	{
	    mComponents[1] = vertAccelThres;
	}
	
	public boolean hasVertAccelThres()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteVertAccelThres()
	{
	    setComponentAbsent(1);
	}
	
	
	// Methods for field "yawRateCon"
	public YawRateConfidence getYawRateCon()
	{
	    return (YawRateConfidence)mComponents[2];
	}
	
	public void setYawRateCon(YawRateConfidence yawRateCon)
	{
	    mComponents[2] = yawRateCon;
	}
	
	public boolean hasYawRateCon()
	{
	    return componentIsPresent(2);
	}
	
	public void deleteYawRateCon()
	{
	    setComponentAbsent(2);
	}
	
	
	// Methods for field "hozAccelCon"
	public AccelerationConfidence getHozAccelCon()
	{
	    return (AccelerationConfidence)mComponents[3];
	}
	
	public void setHozAccelCon(AccelerationConfidence hozAccelCon)
	{
	    mComponents[3] = hozAccelCon;
	}
	
	public boolean hasHozAccelCon()
	{
	    return componentIsPresent(3);
	}
	
	public void deleteHozAccelCon()
	{
	    setComponentAbsent(3);
	}
	
	
	// Methods for field "confidenceSet"
	public ConfidenceSet getConfidenceSet()
	{
	    return (ConfidenceSet)mComponents[4];
	}
	
	public void setConfidenceSet(ConfidenceSet confidenceSet)
	{
	    mComponents[4] = confidenceSet;
	}
	
	public boolean hasConfidenceSet()
	{
	    return componentIsPresent(4);
	}
	
	public void deleteConfidenceSet()
	{
	    setComponentAbsent(4);
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x800b
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"VehicleStatus$AccelSets"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
	    ),
	    274450,
	    null,
	    new FieldsDict (
		new SequenceFieldInfo[] {
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "AccelerationSet4Way"
				),
				new QName (
				    "DSRC",
				    "AccelerationSet4Way"
				),
				274450,
				null,
				new FieldsRef (
				    new QName (
					"dsrc.dsrc",
					"AccelerationSet4Way"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"dsrc.dsrc",
					"AccelerationSet4Way"
				    )
				),
				0
			    )
			),
			"accel4way",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new BitStringInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "VerticalAccelerationThreshold"
				),
				new QName (
				    "DSRC",
				    "VerticalAccelerationThreshold"
				),
				274450,
				new SizeConstraint (
				    new SingleValueConstraint (
					new INTEGER(5)
				    )
				),
				new Bounds (
				    Long.valueOf(5),
				    Long.valueOf(5)
				),
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "notEquipped",
					    0
					),
					new MemberListElement (
					    "leftFront",
					    1
					),
					new MemberListElement (
					    "leftRear",
					    2
					),
					new MemberListElement (
					    "rightFront",
					    3
					),
					new MemberListElement (
					    "rightRear",
					    4
					)
				    }
				)
			    )
			),
			"vertAccelThres",
			1,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8002
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "YawRateConfidence"
				),
				new QName (
				    "DSRC",
				    "YawRateConfidence"
				),
				274450,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "unavailable",
					    0
					),
					new MemberListElement (
					    "degSec-100-00",
					    1
					),
					new MemberListElement (
					    "degSec-010-00",
					    2
					),
					new MemberListElement (
					    "degSec-005-00",
					    3
					),
					new MemberListElement (
					    "degSec-001-00",
					    4
					),
					new MemberListElement (
					    "degSec-000-10",
					    5
					),
					new MemberListElement (
					    "degSec-000-05",
					    6
					),
					new MemberListElement (
					    "degSec-000-01",
					    7
					)
				    }
				),
				0,
				YawRateConfidence.unavailable
			    )
			),
			"yawRateCon",
			2,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8003
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "AccelerationConfidence"
				),
				new QName (
				    "DSRC",
				    "AccelerationConfidence"
				),
				274450,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "unavailable",
					    0
					),
					new MemberListElement (
					    "accl-100-00",
					    1
					),
					new MemberListElement (
					    "accl-010-00",
					    2
					),
					new MemberListElement (
					    "accl-005-00",
					    3
					),
					new MemberListElement (
					    "accl-001-00",
					    4
					),
					new MemberListElement (
					    "accl-000-10",
					    5
					),
					new MemberListElement (
					    "accl-000-05",
					    6
					),
					new MemberListElement (
					    "accl-000-01",
					    7
					)
				    }
				),
				0,
				AccelerationConfidence.unavailable
			    )
			),
			"hozAccelCon",
			3,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8004
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "ConfidenceSet"
				),
				new QName (
				    "DSRC",
				    "ConfidenceSet"
				),
				274454,
				null,
				new FieldsRef (
				    new QName (
					"dsrc.dsrc",
					"ConfidenceSet"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"dsrc.dsrc",
					"ConfidenceSet"
				    )
				),
				0
			    )
			),
			"confidenceSet",
			4,
			3,
			null
		    )
		}
	    ),
	    0,
	    new TagDecoders (
		new TagDecoder[] {
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8000, 0),
			    new TagDecoderElement((short)0x8001, 1),
			    new TagDecoderElement((short)0x8002, 2),
			    new TagDecoderElement((short)0x8003, 3),
			    new TagDecoderElement((short)0x8004, 4)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8001, 1),
			    new TagDecoderElement((short)0x8002, 2),
			    new TagDecoderElement((short)0x8003, 3),
			    new TagDecoderElement((short)0x8004, 4)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8002, 2),
			    new TagDecoderElement((short)0x8003, 3),
			    new TagDecoderElement((short)0x8004, 4)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8003, 3),
			    new TagDecoderElement((short)0x8004, 4)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8004, 4)
			}
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' AccelSets object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' AccelSets object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for AccelSets

    // Methods for field "object"
    public Object getObject()
    {
	return (Object)mComponents[12];
    }
    
    public void setObject(Object object)
    {
	mComponents[12] = object;
    }
    
    public boolean hasObject()
    {
	return componentIsPresent(12);
    }
    
    public void deleteObject()
    {
	setComponentAbsent(12);
    }
    
    
    
    /**
     * Define the ASN1 Type Object from ASN1 Module DSRC.
     * @see Sequence
     */
    public static class Object extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Object()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Object(ObstacleDistance obDist, Angle obDirect, 
			DDateTime dateTime)
	{
	    setObDist(obDist);
	    setObDirect(obDirect);
	    setDateTime(dateTime);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new ObstacleDistance();
	    mComponents[1] = new Angle();
	    mComponents[2] = new DDateTime();
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[3];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return new ObstacleDistance();
		case 1:
		    return new Angle();
		case 2:
		    return new DDateTime();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "obDist"
	public ObstacleDistance getObDist()
	{
	    return (ObstacleDistance)mComponents[0];
	}
	
	public void setObDist(ObstacleDistance obDist)
	{
	    mComponents[0] = obDist;
	}
	
	
	// Methods for field "obDirect"
	public Angle getObDirect()
	{
	    return (Angle)mComponents[1];
	}
	
	public void setObDirect(Angle obDirect)
	{
	    mComponents[1] = obDirect;
	}
	
	
	// Methods for field "dateTime"
	public DDateTime getDateTime()
	{
	    return (DDateTime)mComponents[2];
	}
	
	public void setDateTime(DDateTime dateTime)
	{
	    mComponents[2] = dateTime;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x800c
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"VehicleStatus$Object"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
	    ),
	    274450,
	    null,
	    new FieldsDict (
		new SequenceFieldInfo[] {
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "ObstacleDistance"
				),
				new QName (
				    "DSRC",
				    "ObstacleDistance"
				),
				274450,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new ObstacleDistance(0), 
					new ObstacleDistance(32767),
					0
				    )
				),
				new Bounds (
				    Long.valueOf(0),
				    Long.valueOf(32767)
				),
				null
			    )
			),
			"obDist",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "Angle"
				),
				new QName (
				    "DSRC",
				    "Angle"
				),
				274450,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new Angle(0), 
					new Angle(28800),
					0
				    )
				),
				new Bounds (
				    Long.valueOf(0),
				    Long.valueOf(28800)
				),
				null
			    )
			),
			"obDirect",
			1,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8002
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "DDateTime"
				),
				new QName (
				    "DSRC",
				    "DDateTime"
				),
				274450,
				null,
				new FieldsRef (
				    new QName (
					"dsrc.dsrc",
					"DDateTime"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"dsrc.dsrc",
					"DDateTime"
				    )
				),
				0
			    )
			),
			"dateTime",
			2,
			2,
			null
		    )
		}
	    ),
	    0,
	    new TagDecoders (
		new TagDecoder[] {
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8000, 0)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8001, 1)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8002, 2)
			}
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Object object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Object object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Object

    // Methods for field "fullPos"
    public FullPositionVector getFullPos()
    {
	return (FullPositionVector)mComponents[13];
    }
    
    public void setFullPos(FullPositionVector fullPos)
    {
	mComponents[13] = fullPos;
    }
    
    public boolean hasFullPos()
    {
	return componentIsPresent(13);
    }
    
    public void deleteFullPos()
    {
	setComponentAbsent(13);
    }
    
    
    // Methods for field "throttlePos"
    public ThrottlePosition getThrottlePos()
    {
	return (ThrottlePosition)mComponents[14];
    }
    
    public void setThrottlePos(ThrottlePosition throttlePos)
    {
	mComponents[14] = throttlePos;
    }
    
    public boolean hasThrottlePos()
    {
	return componentIsPresent(14);
    }
    
    public void deleteThrottlePos()
    {
	setComponentAbsent(14);
    }
    
    
    // Methods for field "speedHeadC"
    public SpeedandHeadingandThrottleConfidence getSpeedHeadC()
    {
	return (SpeedandHeadingandThrottleConfidence)mComponents[15];
    }
    
    public void setSpeedHeadC(SpeedandHeadingandThrottleConfidence speedHeadC)
    {
	mComponents[15] = speedHeadC;
    }
    
    public boolean hasSpeedHeadC()
    {
	return componentIsPresent(15);
    }
    
    public void deleteSpeedHeadC()
    {
	setComponentAbsent(15);
    }
    
    
    // Methods for field "speedC"
    public SpeedConfidence getSpeedC()
    {
	return (SpeedConfidence)mComponents[16];
    }
    
    public void setSpeedC(SpeedConfidence speedC)
    {
	mComponents[16] = speedC;
    }
    
    public boolean hasSpeedC()
    {
	return componentIsPresent(16);
    }
    
    public void deleteSpeedC()
    {
	setComponentAbsent(16);
    }
    
    
    // Methods for field "vehicleData"
    public VehicleData getVehicleData()
    {
	return (VehicleData)mComponents[17];
    }
    
    public void setVehicleData(VehicleData vehicleData)
    {
	mComponents[17] = vehicleData;
    }
    
    public boolean hasVehicleData()
    {
	return componentIsPresent(17);
    }
    
    public void deleteVehicleData()
    {
	setComponentAbsent(17);
    }
    
    
    
    /**
     * Define the ASN1 Type VehicleData from ASN1 Module DSRC.
     * @see Sequence
     */
    public static class VehicleData extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public VehicleData()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public VehicleData(VehicleHeight height, BumperHeights bumpers, 
			VehicleMass mass, TrailerWeight trailerWeight, 
			VehicleType type)
	{
	    setHeight(height);
	    setBumpers(bumpers);
	    setMass(mass);
	    setTrailerWeight(trailerWeight);
	    setType(type);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new VehicleHeight();
	    mComponents[1] = new BumperHeights();
	    mComponents[2] = new VehicleMass();
	    mComponents[3] = new TrailerWeight();
	    mComponents[4] = VehicleType.none;
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[5];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return new VehicleHeight();
		case 1:
		    return new BumperHeights();
		case 2:
		    return new VehicleMass();
		case 3:
		    return new TrailerWeight();
		case 4:
		    return VehicleType.none;
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "height"
	public VehicleHeight getHeight()
	{
	    return (VehicleHeight)mComponents[0];
	}
	
	public void setHeight(VehicleHeight height)
	{
	    mComponents[0] = height;
	}
	
	
	// Methods for field "bumpers"
	public BumperHeights getBumpers()
	{
	    return (BumperHeights)mComponents[1];
	}
	
	public void setBumpers(BumperHeights bumpers)
	{
	    mComponents[1] = bumpers;
	}
	
	
	// Methods for field "mass"
	public VehicleMass getMass()
	{
	    return (VehicleMass)mComponents[2];
	}
	
	public void setMass(VehicleMass mass)
	{
	    mComponents[2] = mass;
	}
	
	
	// Methods for field "trailerWeight"
	public TrailerWeight getTrailerWeight()
	{
	    return (TrailerWeight)mComponents[3];
	}
	
	public void setTrailerWeight(TrailerWeight trailerWeight)
	{
	    mComponents[3] = trailerWeight;
	}
	
	
	// Methods for field "type"
	public VehicleType getType()
	{
	    return (VehicleType)mComponents[4];
	}
	
	public void setType(VehicleType type)
	{
	    mComponents[4] = type;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8011
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"VehicleStatus$VehicleData"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
	    ),
	    274450,
	    null,
	    new FieldsDict (
		new SequenceFieldInfo[] {
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "VehicleHeight"
				),
				new QName (
				    "DSRC",
				    "VehicleHeight"
				),
				274450,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new VehicleHeight(0), 
					new VehicleHeight(127),
					0
				    )
				),
				new Bounds (
				    Long.valueOf(0),
				    Long.valueOf(127)
				),
				null
			    )
			),
			"height",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "BumperHeights"
				),
				new QName (
				    "DSRC",
				    "BumperHeights"
				),
				274450,
				null,
				new FieldsRef (
				    new QName (
					"dsrc.dsrc",
					"BumperHeights"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"dsrc.dsrc",
					"BumperHeights"
				    )
				),
				0
			    )
			),
			"bumpers",
			1,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8002
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "VehicleMass"
				),
				new QName (
				    "DSRC",
				    "VehicleMass"
				),
				274450,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new VehicleMass(0), 
					new VehicleMass(255),
					0
				    )
				),
				new Bounds (
				    Long.valueOf(0),
				    Long.valueOf(255)
				),
				null
			    )
			),
			"mass",
			2,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8003
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "TrailerWeight"
				),
				new QName (
				    "DSRC",
				    "TrailerWeight"
				),
				274450,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new TrailerWeight(0), 
					new TrailerWeight(64255),
					0
				    )
				),
				new Bounds (
				    Long.valueOf(0),
				    Long.valueOf(64255)
				),
				null
			    )
			),
			"trailerWeight",
			3,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8004
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "VehicleType"
				),
				new QName (
				    "DSRC",
				    "VehicleType"
				),
				274454,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "none",
					    0
					),
					new MemberListElement (
					    "unknown",
					    1
					),
					new MemberListElement (
					    "special",
					    2
					),
					new MemberListElement (
					    "moto",
					    3
					),
					new MemberListElement (
					    "car",
					    4
					),
					new MemberListElement (
					    "carOther",
					    5
					),
					new MemberListElement (
					    "bus",
					    6
					),
					new MemberListElement (
					    "axleCnt2",
					    7
					),
					new MemberListElement (
					    "axleCnt3",
					    8
					),
					new MemberListElement (
					    "axleCnt4",
					    9
					),
					new MemberListElement (
					    "axleCnt4Trailer",
					    10
					),
					new MemberListElement (
					    "axleCnt5Trailer",
					    11
					),
					new MemberListElement (
					    "axleCnt6Trailer",
					    12
					),
					new MemberListElement (
					    "axleCnt5MultiTrailer",
					    13
					),
					new MemberListElement (
					    "axleCnt6MultiTrailer",
					    14
					),
					new MemberListElement (
					    "axleCnt7MultiTrailer",
					    15
					)
				    }
				),
				0,
				VehicleType.none
			    )
			),
			"type",
			4,
			2,
			null
		    )
		}
	    ),
	    0,
	    new TagDecoders (
		new TagDecoder[] {
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8000, 0)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8001, 1)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8002, 2)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8003, 3)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8004, 4)
			}
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' VehicleData object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' VehicleData object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for VehicleData

    // Methods for field "vehicleIdent"
    public VehicleIdent getVehicleIdent()
    {
	return (VehicleIdent)mComponents[18];
    }
    
    public void setVehicleIdent(VehicleIdent vehicleIdent)
    {
	mComponents[18] = vehicleIdent;
    }
    
    public boolean hasVehicleIdent()
    {
	return componentIsPresent(18);
    }
    
    public void deleteVehicleIdent()
    {
	setComponentAbsent(18);
    }
    
    
    // Methods for field "j1939data"
    public J1939data getJ1939data()
    {
	return (J1939data)mComponents[19];
    }
    
    public void setJ1939data(J1939data j1939data)
    {
	mComponents[19] = j1939data;
    }
    
    public boolean hasJ1939data()
    {
	return componentIsPresent(19);
    }
    
    public void deleteJ1939data()
    {
	setComponentAbsent(19);
    }
    
    
    // Methods for field "weatherReport"
    public WeatherReport getWeatherReport()
    {
	return (WeatherReport)mComponents[20];
    }
    
    public void setWeatherReport(WeatherReport weatherReport)
    {
	mComponents[20] = weatherReport;
    }
    
    public boolean hasWeatherReport()
    {
	return componentIsPresent(20);
    }
    
    public void deleteWeatherReport()
    {
	setComponentAbsent(20);
    }
    
    
    
    /**
     * Define the ASN1 Type WeatherReport from ASN1 Module DSRC.
     * @see Sequence
     */
    public static class WeatherReport extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public WeatherReport()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public WeatherReport(dsrc.ntcip.EssPrecipYesNo isRaining, 
			dsrc.ntcip.EssPrecipRate rainRate, 
			dsrc.ntcip.EssPrecipSituation precipSituation, 
			dsrc.ntcip.EssSolarRadiation solarRadiation, 
			dsrc.ntcip.EssMobileFriction friction)
	{
	    setIsRaining(isRaining);
	    setRainRate(rainRate);
	    setPrecipSituation(precipSituation);
	    setSolarRadiation(solarRadiation);
	    setFriction(friction);
	}
	
	/**
	 * Construct with required components.
	 */
	public WeatherReport(dsrc.ntcip.EssPrecipYesNo isRaining)
	{
	    setIsRaining(isRaining);
	}
	
	public void initComponents()
	{
	    mComponents[0] = dsrc.ntcip.EssPrecipYesNo.precip;
	    mComponents[1] = new dsrc.ntcip.EssPrecipRate();
	    mComponents[2] = dsrc.ntcip.EssPrecipSituation.other;
	    mComponents[3] = new dsrc.ntcip.EssSolarRadiation();
	    mComponents[4] = new dsrc.ntcip.EssMobileFriction();
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[5];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return dsrc.ntcip.EssPrecipYesNo.precip;
		case 1:
		    return new dsrc.ntcip.EssPrecipRate();
		case 2:
		    return dsrc.ntcip.EssPrecipSituation.other;
		case 3:
		    return new dsrc.ntcip.EssSolarRadiation();
		case 4:
		    return new dsrc.ntcip.EssMobileFriction();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "isRaining"
	public dsrc.ntcip.EssPrecipYesNo getIsRaining()
	{
	    return (dsrc.ntcip.EssPrecipYesNo)mComponents[0];
	}
	
	public void setIsRaining(dsrc.ntcip.EssPrecipYesNo isRaining)
	{
	    mComponents[0] = isRaining;
	}
	
	
	// Methods for field "rainRate"
	public dsrc.ntcip.EssPrecipRate getRainRate()
	{
	    return (dsrc.ntcip.EssPrecipRate)mComponents[1];
	}
	
	public void setRainRate(dsrc.ntcip.EssPrecipRate rainRate)
	{
	    mComponents[1] = rainRate;
	}
	
	public boolean hasRainRate()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteRainRate()
	{
	    setComponentAbsent(1);
	}
	
	
	// Methods for field "precipSituation"
	public dsrc.ntcip.EssPrecipSituation getPrecipSituation()
	{
	    return (dsrc.ntcip.EssPrecipSituation)mComponents[2];
	}
	
	public void setPrecipSituation(dsrc.ntcip.EssPrecipSituation precipSituation)
	{
	    mComponents[2] = precipSituation;
	}
	
	public boolean hasPrecipSituation()
	{
	    return componentIsPresent(2);
	}
	
	public void deletePrecipSituation()
	{
	    setComponentAbsent(2);
	}
	
	
	// Methods for field "solarRadiation"
	public dsrc.ntcip.EssSolarRadiation getSolarRadiation()
	{
	    return (dsrc.ntcip.EssSolarRadiation)mComponents[3];
	}
	
	public void setSolarRadiation(dsrc.ntcip.EssSolarRadiation solarRadiation)
	{
	    mComponents[3] = solarRadiation;
	}
	
	public boolean hasSolarRadiation()
	{
	    return componentIsPresent(3);
	}
	
	public void deleteSolarRadiation()
	{
	    setComponentAbsent(3);
	}
	
	
	// Methods for field "friction"
	public dsrc.ntcip.EssMobileFriction getFriction()
	{
	    return (dsrc.ntcip.EssMobileFriction)mComponents[4];
	}
	
	public void setFriction(dsrc.ntcip.EssMobileFriction friction)
	{
	    mComponents[4] = friction;
	}
	
	public boolean hasFriction()
	{
	    return componentIsPresent(4);
	}
	
	public void deleteFriction()
	{
	    setComponentAbsent(4);
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8014
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"VehicleStatus$WeatherReport"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
	    ),
	    274450,
	    null,
	    new FieldsDict (
		new SequenceFieldInfo[] {
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "dsrc.ntcip",
				    "EssPrecipYesNo"
				),
				new QName (
				    "NTCIP",
				    "EssPrecipYesNo"
				),
				274450,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "precip",
					    1
					),
					new MemberListElement (
					    "noPrecip",
					    2
					),
					new MemberListElement (
					    "error",
					    3
					)
				    }
				),
				0,
				dsrc.ntcip.EssPrecipYesNo.precip
			    )
			),
			"isRaining",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "dsrc.ntcip",
				    "EssPrecipRate"
				),
				new QName (
				    "NTCIP",
				    "EssPrecipRate"
				),
				274450,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new dsrc.ntcip.EssPrecipRate(0), 
					new dsrc.ntcip.EssPrecipRate(65535),
					0
				    )
				),
				new Bounds (
				    Long.valueOf(0),
				    Long.valueOf(65535)
				),
				null
			    )
			),
			"rainRate",
			1,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8002
				    }
				),
				new QName (
				    "dsrc.ntcip",
				    "EssPrecipSituation"
				),
				new QName (
				    "NTCIP",
				    "EssPrecipSituation"
				),
				274450,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "other",
					    1
					),
					new MemberListElement (
					    "unknown",
					    2
					),
					new MemberListElement (
					    "noPrecipitation",
					    3
					),
					new MemberListElement (
					    "unidentifiedSlight",
					    4
					),
					new MemberListElement (
					    "unidentifiedModerate",
					    5
					),
					new MemberListElement (
					    "unidentifiedHeavy",
					    6
					),
					new MemberListElement (
					    "snowSlight",
					    7
					),
					new MemberListElement (
					    "snowModerate",
					    8
					),
					new MemberListElement (
					    "snowHeavy",
					    9
					),
					new MemberListElement (
					    "rainSlight",
					    10
					),
					new MemberListElement (
					    "rainModerate",
					    11
					),
					new MemberListElement (
					    "rainHeavy",
					    12
					),
					new MemberListElement (
					    "frozenPrecipitationSlight",
					    13
					),
					new MemberListElement (
					    "frozenPrecipitationModerate",
					    14
					),
					new MemberListElement (
					    "frozenPrecipitationHeavy",
					    15
					)
				    }
				),
				0,
				dsrc.ntcip.EssPrecipSituation.other
			    )
			),
			"precipSituation",
			2,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8003
				    }
				),
				new QName (
				    "dsrc.ntcip",
				    "EssSolarRadiation"
				),
				new QName (
				    "NTCIP",
				    "EssSolarRadiation"
				),
				274450,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new dsrc.ntcip.EssSolarRadiation(0), 
					new dsrc.ntcip.EssSolarRadiation(65535),
					0
				    )
				),
				new Bounds (
				    Long.valueOf(0),
				    Long.valueOf(65535)
				),
				null
			    )
			),
			"solarRadiation",
			3,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8004
				    }
				),
				new QName (
				    "dsrc.ntcip",
				    "EssMobileFriction"
				),
				new QName (
				    "NTCIP",
				    "EssMobileFriction"
				),
				274450,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new dsrc.ntcip.EssMobileFriction(0), 
					new dsrc.ntcip.EssMobileFriction(101),
					0
				    )
				),
				new Bounds (
				    Long.valueOf(0),
				    Long.valueOf(101)
				),
				null
			    )
			),
			"friction",
			4,
			3,
			null
		    )
		}
	    ),
	    0,
	    new TagDecoders (
		new TagDecoder[] {
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8000, 0)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8001, 1),
			    new TagDecoderElement((short)0x8002, 2),
			    new TagDecoderElement((short)0x8003, 3),
			    new TagDecoderElement((short)0x8004, 4)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8002, 2),
			    new TagDecoderElement((short)0x8003, 3),
			    new TagDecoderElement((short)0x8004, 4)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8003, 3),
			    new TagDecoderElement((short)0x8004, 4)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8004, 4)
			}
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' WeatherReport object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' WeatherReport object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for WeatherReport

    // Methods for field "gnssStatus"
    public GNSSstatus getGnssStatus()
    {
	return (GNSSstatus)mComponents[21];
    }
    
    public void setGnssStatus(GNSSstatus gnssStatus)
    {
	mComponents[21] = gnssStatus;
    }
    
    public boolean hasGnssStatus()
    {
	return componentIsPresent(21);
    }
    
    public void deleteGnssStatus()
    {
	setComponentAbsent(21);
    }
    
    
    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "dsrc.dsrc",
	    "VehicleStatus"
	),
	new QName (
	    "DSRC",
	    "VehicleStatus"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"ExteriorLights"
			    ),
			    new QName (
				"DSRC",
				"ExteriorLights"
			    ),
			    274454,
			    new SizeConstraint (
				new ExtensibleConstraint (
				    new SingleValueConstraint (
					new INTEGER(9)
				    ),
				    null
				)
			    ),
			    new Bounds (
				Long.valueOf(9),
				Long.valueOf(9)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"lowBeamHeadlightsOn",
					0
				    ),
				    new MemberListElement (
					"highBeamHeadlightsOn",
					1
				    ),
				    new MemberListElement (
					"leftTurnSignalOn",
					2
				    ),
				    new MemberListElement (
					"rightTurnSignalOn",
					3
				    ),
				    new MemberListElement (
					"hazardSignalOn",
					4
				    ),
				    new MemberListElement (
					"automaticLightControlOn",
					5
				    ),
				    new MemberListElement (
					"daytimeRunningLightsOn",
					6
				    ),
				    new MemberListElement (
					"fogLightOn",
					7
				    ),
				    new MemberListElement (
					"parkingLightsOn",
					8
				    )
				}
			    )
			)
		    ),
		    "lights",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"LightbarInUse"
			    ),
			    new QName (
				"DSRC",
				"LightbarInUse"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"notInUse",
					1
				    ),
				    new MemberListElement (
					"inUse",
					2
				    ),
				    new MemberListElement (
					"yellowCautionLights",
					3
				    ),
				    new MemberListElement (
					"schooldBusLights",
					4
				    ),
				    new MemberListElement (
					"arrowSignsActive",
					5
				    ),
				    new MemberListElement (
					"slowMovingVehicle",
					6
				    ),
				    new MemberListElement (
					"freqStops",
					7
				    )
				}
			    ),
			    0,
			    LightbarInUse.unavailable
			)
		    ),
		    "lightBar",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"WiperSet"
			    ),
			    new QName (
				"DSRC",
				"WiperSet"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "WiperSet"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "WiperSet"
				)
			    ),
			    0
			)
		    ),
		    "wipers",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"BrakeSystemStatus"
			    ),
			    new QName (
				"DSRC",
				"BrakeSystemStatus"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "BrakeSystemStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "BrakeSystemStatus"
				)
			    ),
			    0
			)
		    ),
		    "brakeStatus",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"BrakeAppliedPressure"
			    ),
			    new QName (
				"DSRC",
				"BrakeAppliedPressure"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"minPressure",
					1
				    ),
				    new MemberListElement (
					"bkLvl-2",
					2
				    ),
				    new MemberListElement (
					"bkLvl-3",
					3
				    ),
				    new MemberListElement (
					"bkLvl-4",
					4
				    ),
				    new MemberListElement (
					"bkLvl-5",
					5
				    ),
				    new MemberListElement (
					"bkLvl-6",
					6
				    ),
				    new MemberListElement (
					"bkLvl-7",
					7
				    ),
				    new MemberListElement (
					"bkLvl-8",
					8
				    ),
				    new MemberListElement (
					"bkLvl-9",
					9
				    ),
				    new MemberListElement (
					"bkLvl-10",
					10
				    ),
				    new MemberListElement (
					"bkLvl-11",
					11
				    ),
				    new MemberListElement (
					"bkLvl-12",
					12
				    ),
				    new MemberListElement (
					"bkLvl-13",
					13
				    ),
				    new MemberListElement (
					"bkLvl-14",
					14
				    ),
				    new MemberListElement (
					"maxPressure",
					15
				    )
				}
			    ),
			    0,
			    BrakeAppliedPressure.unavailable
			)
		    ),
		    "brakePressure",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"CoefficientOfFriction"
			    ),
			    new QName (
				"DSRC",
				"CoefficientOfFriction"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CoefficientOfFriction(0), 
				    new CoefficientOfFriction(50),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(50)
			    ),
			    null
			)
		    ),
		    "roadFriction",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"SunSensor"
			    ),
			    new QName (
				"DSRC",
				"SunSensor"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SunSensor(0), 
				    new SunSensor(1000),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(1000)
			    ),
			    null
			)
		    ),
		    "sunData",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"RainSensor"
			    ),
			    new QName (
				"DSRC",
				"RainSensor"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"none",
					0
				    ),
				    new MemberListElement (
					"lightMist",
					1
				    ),
				    new MemberListElement (
					"heavyMist",
					2
				    ),
				    new MemberListElement (
					"lightRainOrDrizzle",
					3
				    ),
				    new MemberListElement (
					"rain",
					4
				    ),
				    new MemberListElement (
					"moderateRain",
					5
				    ),
				    new MemberListElement (
					"heavyRain",
					6
				    ),
				    new MemberListElement (
					"heavyDownpour",
					7
				    )
				}
			    ),
			    0,
			    RainSensor.none
			)
		    ),
		    "rainData",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"AmbientAirTemperature"
			    ),
			    new QName (
				"DSRC",
				"AmbientAirTemperature"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new AmbientAirTemperature(0), 
				    new AmbientAirTemperature(191),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(191)
			    ),
			    null
			)
		    ),
		    "airTemp",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"AmbientAirPressure"
			    ),
			    new QName (
				"DSRC",
				"AmbientAirPressure"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new AmbientAirPressure(0), 
				    new AmbientAirPressure(255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(255)
			    ),
			    null
			)
		    ),
		    "airPres",
		    9,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "VehicleStatus$Steering"
			)
		    ),
		    "steering",
		    10,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "VehicleStatus$AccelSets"
			)
		    ),
		    "accelSets",
		    11,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "VehicleStatus$Object"
			)
		    ),
		    "object",
		    12,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"FullPositionVector"
			    ),
			    new QName (
				"DSRC",
				"FullPositionVector"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "FullPositionVector"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "FullPositionVector"
				)
			    ),
			    0
			)
		    ),
		    "fullPos",
		    13,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"ThrottlePosition"
			    ),
			    new QName (
				"DSRC",
				"ThrottlePosition"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ThrottlePosition(0), 
				    new ThrottlePosition(200),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(200)
			    ),
			    null
			)
		    ),
		    "throttlePos",
		    14,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"SpeedandHeadingandThrottleConfidence"
			    ),
			    new QName (
				"DSRC",
				"SpeedandHeadingandThrottleConfidence"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "SpeedandHeadingandThrottleConfidence"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "SpeedandHeadingandThrottleConfidence"
				)
			    ),
			    0
			)
		    ),
		    "speedHeadC",
		    15,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8010
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"SpeedConfidence"
			    ),
			    new QName (
				"DSRC",
				"SpeedConfidence"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"prec100ms",
					1
				    ),
				    new MemberListElement (
					"prec10ms",
					2
				    ),
				    new MemberListElement (
					"prec5ms",
					3
				    ),
				    new MemberListElement (
					"prec1ms",
					4
				    ),
				    new MemberListElement (
					"prec0-1ms",
					5
				    ),
				    new MemberListElement (
					"prec0-05ms",
					6
				    ),
				    new MemberListElement (
					"prec0-01ms",
					7
				    )
				}
			    ),
			    0,
			    SpeedConfidence.unavailable
			)
		    ),
		    "speedC",
		    16,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "VehicleStatus$VehicleData"
			)
		    ),
		    "vehicleData",
		    17,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8012
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"VehicleIdent"
			    ),
			    new QName (
				"DSRC",
				"VehicleIdent"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "VehicleIdent"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "VehicleIdent"
				)
			    ),
			    0
			)
		    ),
		    "vehicleIdent",
		    18,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8013
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"J1939data"
			    ),
			    new QName (
				"DSRC",
				"J1939data"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "J1939data"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "J1939data"
				)
			    ),
			    0
			)
		    ),
		    "j1939data",
		    19,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "VehicleStatus$WeatherReport"
			)
		    ),
		    "weatherReport",
		    20,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8015
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"GNSSstatus"
			    ),
			    new QName (
				"DSRC",
				"GNSSstatus"
			    ),
			    274450,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new INTEGER(8)
				)
			    ),
			    new Bounds (
				Long.valueOf(8),
				Long.valueOf(8)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"isHealthy",
					1
				    ),
				    new MemberListElement (
					"isMonitored",
					2
				    ),
				    new MemberListElement (
					"baseStationType",
					3
				    ),
				    new MemberListElement (
					"aPDOPofUnder5",
					4
				    ),
				    new MemberListElement (
					"inViewOfUnder5",
					5
				    ),
				    new MemberListElement (
					"localCorrectionsPresent",
					6
				    ),
				    new MemberListElement (
					"networkCorrectionsPresent",
					7
				    )
				}
			    )
			)
		    ),
		    "gnssStatus",
		    21,
		    3,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8015, 21)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' VehicleStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' VehicleStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for VehicleStatus
