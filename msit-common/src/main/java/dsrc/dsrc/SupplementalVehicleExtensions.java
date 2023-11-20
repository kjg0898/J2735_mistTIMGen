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

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type SupplementalVehicleExtensions from ASN1 Module DSRC.
 * @see Sequence
 */

public class SupplementalVehicleExtensions extends Sequence {
    
    /**
     * The default constructor.
     */
    public SupplementalVehicleExtensions()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SupplementalVehicleExtensions(BasicVehicleClass classification, 
		    VehicleClassification classDetails, 
		    VehicleData vehicleData, WeatherReport weatherReport, 
		    WeatherProbe weatherProbe, ObstacleDetection obstacle, 
		    DisabledVehicle status, SpeedProfile speedProfile, 
		    RTCMPackage theRTCM, Regional regional)
    {
	setClassification(classification);
	setClassDetails(classDetails);
	setVehicleData(vehicleData);
	setWeatherReport(weatherReport);
	setWeatherProbe(weatherProbe);
	setObstacle(obstacle);
	setStatus(status);
	setSpeedProfile(speedProfile);
	setTheRTCM(theRTCM);
	setRegional(regional);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BasicVehicleClass();
	mComponents[1] = new VehicleClassification();
	mComponents[2] = new VehicleData();
	mComponents[3] = new WeatherReport();
	mComponents[4] = new WeatherProbe();
	mComponents[5] = new ObstacleDetection();
	mComponents[6] = new DisabledVehicle();
	mComponents[7] = new SpeedProfile();
	mComponents[8] = new RTCMPackage();
	mComponents[9] = new Regional();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[10];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new BasicVehicleClass();
	    case 1:
		return new VehicleClassification();
	    case 2:
		return new VehicleData();
	    case 3:
		return new WeatherReport();
	    case 4:
		return new WeatherProbe();
	    case 5:
		return new ObstacleDetection();
	    case 6:
		return new DisabledVehicle();
	    case 7:
		return new SpeedProfile();
	    case 8:
		return new RTCMPackage();
	    case 9:
		return new Regional();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "classification"
    public BasicVehicleClass getClassification()
    {
	return (BasicVehicleClass)mComponents[0];
    }
    
    public void setClassification(BasicVehicleClass classification)
    {
	mComponents[0] = classification;
    }
    
    public boolean hasClassification()
    {
	return componentIsPresent(0);
    }
    
    public void deleteClassification()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "classDetails"
    public VehicleClassification getClassDetails()
    {
	return (VehicleClassification)mComponents[1];
    }
    
    public void setClassDetails(VehicleClassification classDetails)
    {
	mComponents[1] = classDetails;
    }
    
    public boolean hasClassDetails()
    {
	return componentIsPresent(1);
    }
    
    public void deleteClassDetails()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "vehicleData"
    public VehicleData getVehicleData()
    {
	return (VehicleData)mComponents[2];
    }
    
    public void setVehicleData(VehicleData vehicleData)
    {
	mComponents[2] = vehicleData;
    }
    
    public boolean hasVehicleData()
    {
	return componentIsPresent(2);
    }
    
    public void deleteVehicleData()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "weatherReport"
    public WeatherReport getWeatherReport()
    {
	return (WeatherReport)mComponents[3];
    }
    
    public void setWeatherReport(WeatherReport weatherReport)
    {
	mComponents[3] = weatherReport;
    }
    
    public boolean hasWeatherReport()
    {
	return componentIsPresent(3);
    }
    
    public void deleteWeatherReport()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "weatherProbe"
    public WeatherProbe getWeatherProbe()
    {
	return (WeatherProbe)mComponents[4];
    }
    
    public void setWeatherProbe(WeatherProbe weatherProbe)
    {
	mComponents[4] = weatherProbe;
    }
    
    public boolean hasWeatherProbe()
    {
	return componentIsPresent(4);
    }
    
    public void deleteWeatherProbe()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "obstacle"
    public ObstacleDetection getObstacle()
    {
	return (ObstacleDetection)mComponents[5];
    }
    
    public void setObstacle(ObstacleDetection obstacle)
    {
	mComponents[5] = obstacle;
    }
    
    public boolean hasObstacle()
    {
	return componentIsPresent(5);
    }
    
    public void deleteObstacle()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "status"
    public DisabledVehicle getStatus()
    {
	return (DisabledVehicle)mComponents[6];
    }
    
    public void setStatus(DisabledVehicle status)
    {
	mComponents[6] = status;
    }
    
    public boolean hasStatus()
    {
	return componentIsPresent(6);
    }
    
    public void deleteStatus()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "speedProfile"
    public SpeedProfile getSpeedProfile()
    {
	return (SpeedProfile)mComponents[7];
    }
    
    public void setSpeedProfile(SpeedProfile speedProfile)
    {
	mComponents[7] = speedProfile;
    }
    
    public boolean hasSpeedProfile()
    {
	return componentIsPresent(7);
    }
    
    public void deleteSpeedProfile()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "theRTCM"
    public RTCMPackage getTheRTCM()
    {
	return (RTCMPackage)mComponents[8];
    }
    
    public void setTheRTCM(RTCMPackage theRTCM)
    {
	mComponents[8] = theRTCM;
    }
    
    public boolean hasTheRTCM()
    {
	return componentIsPresent(8);
    }
    
    public void deleteTheRTCM()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "regional"
    public Regional getRegional()
    {
	return (Regional)mComponents[9];
    }
    
    public void setRegional(Regional regional)
    {
	mComponents[9] = regional;
    }
    
    public boolean hasRegional()
    {
	return componentIsPresent(9);
    }
    
    public void deleteRegional()
    {
	setComponentAbsent(9);
    }
    
    
    
    /**
     * Define the ASN1 Type Regional from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class Regional extends SequenceOf<Regional.Sequence_> {
	
	/**
	 * The default constructor.
	 */
	public Regional()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Regional(Sequence_[] elements)
	{
	    super(elements);
	}
	
	
	/**
	 * Define the ASN1 Type Sequence_ from ASN1 Module DSRC.
	 * @see Sequence
	 */
	public static class Sequence_ extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Sequence_()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Sequence_(RegionId regionId, OpenType regExtValue)
	    {
		setRegionId(regionId);
		setRegExtValue(regExtValue);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new RegionId();
		mComponents[1] = new OpenType();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[2];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new RegionId();
		    case 1:
			return new OpenType();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "regionId"
	    public RegionId getRegionId()
	    {
		return (RegionId)mComponents[0];
	    }
	    
	    public void setRegionId(RegionId regionId)
	    {
		mComponents[0] = regionId;
	    }
	    
	    
	    // Methods for field "regExtValue"
	    public OpenType getRegExtValue()
	    {
		return (OpenType)mComponents[1];
	    }
	    
	    public void setRegExtValue(OpenType regExtValue)
	    {
		mComponents[1] = regExtValue;
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
		    "SupplementalVehicleExtensions$Regional$Sequence_"
		),
		new QName (
		    "builtin",
		    "SEQUENCE"
		),
		274962,
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
					"RegionId"
				    ),
				    new QName (
					"DSRC",
					"RegionId"
				    ),
				    274450,
				    new Intersection (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new RegionId(0), 
						new RegionId(255),
						0
					    )
					),
					new TableConstraint (
					    dsrc.region.REGION.reg_SupplementalVehicleExtensions,
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
			    "regionId",
			    0,
			    274,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new OpenTypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"com.oss.asn1",
					"OpenType"
				    ),
				    new QName (
					"builtin",
					"OpenType"
				    ),
				    1323026,
				    new ComponentRelationConstraint (
					new TableConstraint (
					    dsrc.region.REGION.reg_SupplementalVehicleExtensions,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "SupplementalVehicleExtensions$Regional$Sequence_"
							),
							0
						    ),
						    0
						)
					    }
					)
				    ),
				    new ComponentRelationConstraint (
					new TableConstraint (
					    dsrc.region.REGION.reg_SupplementalVehicleExtensions,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "SupplementalVehicleExtensions$Regional$Sequence_"
							),
							0
						    ),
						    0
						)
					    }
					)
				    )
				)
			    ),
			    "regExtValue",
			    1,
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
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Sequence_ object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Sequence_ object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Sequence_

	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new Sequence_();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8009
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"SupplementalVehicleExtensions$Regional"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    274450,
	    new SizeConstraint (
		new ValueRangeConstraint (
		    new AbstractBounds(
			new INTEGER(1),
			new INTEGER(4),
			0
		    )
		)
	    ),
	    new Bounds (
		Long.valueOf(1),
		Long.valueOf(4)
	    ),
	    new TypeInfoRef (
		new QName (
		    "dsrc.dsrc",
		    "SupplementalVehicleExtensions$Regional$Sequence_"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Regional object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Regional object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Regional

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
	    "SupplementalVehicleExtensions"
	),
	new QName (
	    "DSRC",
	    "SupplementalVehicleExtensions"
	),
	274454,
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
				"BasicVehicleClass"
			    ),
			    new QName (
				"DSRC",
				"BasicVehicleClass"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new BasicVehicleClass(0), 
				    new BasicVehicleClass(255),
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
		    "classification",
		    0,
		    3,
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
				"VehicleClassification"
			    ),
			    new QName (
				"DSRC",
				"VehicleClassification"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "VehicleClassification"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "VehicleClassification"
				)
			    ),
			    0
			)
		    ),
		    "classDetails",
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
				"VehicleData"
			    ),
			    new QName (
				"DSRC",
				"VehicleData"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "VehicleData"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "VehicleData"
				)
			    ),
			    0
			)
		    ),
		    "vehicleData",
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
				"WeatherReport"
			    ),
			    new QName (
				"DSRC",
				"WeatherReport"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "WeatherReport"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "WeatherReport"
				)
			    ),
			    0
			)
		    ),
		    "weatherReport",
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
				"WeatherProbe"
			    ),
			    new QName (
				"DSRC",
				"WeatherProbe"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "WeatherProbe"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "WeatherProbe"
				)
			    ),
			    0
			)
		    ),
		    "weatherProbe",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"ObstacleDetection"
			    ),
			    new QName (
				"DSRC",
				"ObstacleDetection"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "ObstacleDetection"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "ObstacleDetection"
				)
			    ),
			    0
			)
		    ),
		    "obstacle",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"DisabledVehicle"
			    ),
			    new QName (
				"DSRC",
				"DisabledVehicle"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "DisabledVehicle"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "DisabledVehicle"
				)
			    ),
			    0
			)
		    ),
		    "status",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"SpeedProfile"
			    ),
			    new QName (
				"DSRC",
				"SpeedProfile"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "SpeedProfile"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "SpeedProfile"
				)
			    ),
			    0
			)
		    ),
		    "speedProfile",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"RTCMPackage"
			    ),
			    new QName (
				"DSRC",
				"RTCMPackage"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "RTCMPackage"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "RTCMPackage"
				)
			    ),
			    0
			)
		    ),
		    "theRTCM",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "SupplementalVehicleExtensions$Regional"
			)
		    ),
		    "regional",
		    9,
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
			new TagDecoderElement((short)0x8009, 9)
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
			new TagDecoderElement((short)0x8009, 9)
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
			new TagDecoderElement((short)0x8009, 9)
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
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SupplementalVehicleExtensions object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SupplementalVehicleExtensions object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SupplementalVehicleExtensions
