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
 * Define the ASN1 Type J1939data from ASN1 Module DSRC.
 * @see Sequence
 */

public class J1939data extends Sequence {
    
    /**
     * The default constructor.
     */
    public J1939data()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public J1939data(TireDataList tires, AxleWeightList axles, 
		    TrailerWeight trailerWeight, CargoWeight cargoWeight, 
		    SteeringAxleTemperature steeringAxleTemperature, 
		    DriveAxleLocation driveAxleLocation, 
		    DriveAxleLiftAirPressure driveAxleLiftAirPressure, 
		    DriveAxleTemperature driveAxleTemperature, 
		    DriveAxleLubePressure driveAxleLubePressure, 
		    SteeringAxleLubePressure steeringAxleLubePressure)
    {
	setTires(tires);
	setAxles(axles);
	setTrailerWeight(trailerWeight);
	setCargoWeight(cargoWeight);
	setSteeringAxleTemperature(steeringAxleTemperature);
	setDriveAxleLocation(driveAxleLocation);
	setDriveAxleLiftAirPressure(driveAxleLiftAirPressure);
	setDriveAxleTemperature(driveAxleTemperature);
	setDriveAxleLubePressure(driveAxleLubePressure);
	setSteeringAxleLubePressure(steeringAxleLubePressure);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TireDataList();
	mComponents[1] = new AxleWeightList();
	mComponents[2] = new TrailerWeight();
	mComponents[3] = new CargoWeight();
	mComponents[4] = new SteeringAxleTemperature();
	mComponents[5] = new DriveAxleLocation();
	mComponents[6] = new DriveAxleLiftAirPressure();
	mComponents[7] = new DriveAxleTemperature();
	mComponents[8] = new DriveAxleLubePressure();
	mComponents[9] = new SteeringAxleLubePressure();
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
		return new TireDataList();
	    case 1:
		return new AxleWeightList();
	    case 2:
		return new TrailerWeight();
	    case 3:
		return new CargoWeight();
	    case 4:
		return new SteeringAxleTemperature();
	    case 5:
		return new DriveAxleLocation();
	    case 6:
		return new DriveAxleLiftAirPressure();
	    case 7:
		return new DriveAxleTemperature();
	    case 8:
		return new DriveAxleLubePressure();
	    case 9:
		return new SteeringAxleLubePressure();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tires"
    public TireDataList getTires()
    {
	return (TireDataList)mComponents[0];
    }
    
    public void setTires(TireDataList tires)
    {
	mComponents[0] = tires;
    }
    
    public boolean hasTires()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTires()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "axles"
    public AxleWeightList getAxles()
    {
	return (AxleWeightList)mComponents[1];
    }
    
    public void setAxles(AxleWeightList axles)
    {
	mComponents[1] = axles;
    }
    
    public boolean hasAxles()
    {
	return componentIsPresent(1);
    }
    
    public void deleteAxles()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "trailerWeight"
    public TrailerWeight getTrailerWeight()
    {
	return (TrailerWeight)mComponents[2];
    }
    
    public void setTrailerWeight(TrailerWeight trailerWeight)
    {
	mComponents[2] = trailerWeight;
    }
    
    public boolean hasTrailerWeight()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTrailerWeight()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "cargoWeight"
    public CargoWeight getCargoWeight()
    {
	return (CargoWeight)mComponents[3];
    }
    
    public void setCargoWeight(CargoWeight cargoWeight)
    {
	mComponents[3] = cargoWeight;
    }
    
    public boolean hasCargoWeight()
    {
	return componentIsPresent(3);
    }
    
    public void deleteCargoWeight()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "steeringAxleTemperature"
    public SteeringAxleTemperature getSteeringAxleTemperature()
    {
	return (SteeringAxleTemperature)mComponents[4];
    }
    
    public void setSteeringAxleTemperature(SteeringAxleTemperature steeringAxleTemperature)
    {
	mComponents[4] = steeringAxleTemperature;
    }
    
    public boolean hasSteeringAxleTemperature()
    {
	return componentIsPresent(4);
    }
    
    public void deleteSteeringAxleTemperature()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "driveAxleLocation"
    public DriveAxleLocation getDriveAxleLocation()
    {
	return (DriveAxleLocation)mComponents[5];
    }
    
    public void setDriveAxleLocation(DriveAxleLocation driveAxleLocation)
    {
	mComponents[5] = driveAxleLocation;
    }
    
    public boolean hasDriveAxleLocation()
    {
	return componentIsPresent(5);
    }
    
    public void deleteDriveAxleLocation()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "driveAxleLiftAirPressure"
    public DriveAxleLiftAirPressure getDriveAxleLiftAirPressure()
    {
	return (DriveAxleLiftAirPressure)mComponents[6];
    }
    
    public void setDriveAxleLiftAirPressure(DriveAxleLiftAirPressure driveAxleLiftAirPressure)
    {
	mComponents[6] = driveAxleLiftAirPressure;
    }
    
    public boolean hasDriveAxleLiftAirPressure()
    {
	return componentIsPresent(6);
    }
    
    public void deleteDriveAxleLiftAirPressure()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "driveAxleTemperature"
    public DriveAxleTemperature getDriveAxleTemperature()
    {
	return (DriveAxleTemperature)mComponents[7];
    }
    
    public void setDriveAxleTemperature(DriveAxleTemperature driveAxleTemperature)
    {
	mComponents[7] = driveAxleTemperature;
    }
    
    public boolean hasDriveAxleTemperature()
    {
	return componentIsPresent(7);
    }
    
    public void deleteDriveAxleTemperature()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "driveAxleLubePressure"
    public DriveAxleLubePressure getDriveAxleLubePressure()
    {
	return (DriveAxleLubePressure)mComponents[8];
    }
    
    public void setDriveAxleLubePressure(DriveAxleLubePressure driveAxleLubePressure)
    {
	mComponents[8] = driveAxleLubePressure;
    }
    
    public boolean hasDriveAxleLubePressure()
    {
	return componentIsPresent(8);
    }
    
    public void deleteDriveAxleLubePressure()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "steeringAxleLubePressure"
    public SteeringAxleLubePressure getSteeringAxleLubePressure()
    {
	return (SteeringAxleLubePressure)mComponents[9];
    }
    
    public void setSteeringAxleLubePressure(SteeringAxleLubePressure steeringAxleLubePressure)
    {
	mComponents[9] = steeringAxleLubePressure;
    }
    
    public boolean hasSteeringAxleLubePressure()
    {
	return componentIsPresent(9);
    }
    
    public void deleteSteeringAxleLubePressure()
    {
	setComponentAbsent(9);
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
	    "J1939data"
	),
	new QName (
	    "DSRC",
	    "J1939data"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"TireDataList"
			    ),
			    new QName (
				"DSRC",
				"TireDataList"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "dsrc.dsrc",
				    "TireData"
				)
			    )
			)
		    ),
		    "tires",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"AxleWeightList"
			    ),
			    new QName (
				"DSRC",
				"AxleWeightList"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "dsrc.dsrc",
				    "AxleWeightSet"
				)
			    )
			)
		    ),
		    "axles",
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
				"CargoWeight"
			    ),
			    new QName (
				"DSRC",
				"CargoWeight"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CargoWeight(0), 
				    new CargoWeight(64255),
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
		    "cargoWeight",
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
				"dsrc.dsrc",
				"SteeringAxleTemperature"
			    ),
			    new QName (
				"DSRC",
				"SteeringAxleTemperature"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SteeringAxleTemperature(-40), 
				    new SteeringAxleTemperature(210),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-40),
				Long.valueOf(210)
			    ),
			    null
			)
		    ),
		    "steeringAxleTemperature",
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
				"DriveAxleLocation"
			    ),
			    new QName (
				"DSRC",
				"DriveAxleLocation"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DriveAxleLocation(0), 
				    new DriveAxleLocation(255),
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
		    "driveAxleLocation",
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
				"DriveAxleLiftAirPressure"
			    ),
			    new QName (
				"DSRC",
				"DriveAxleLiftAirPressure"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DriveAxleLiftAirPressure(0), 
				    new DriveAxleLiftAirPressure(1000),
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
		    "driveAxleLiftAirPressure",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"DriveAxleTemperature"
			    ),
			    new QName (
				"DSRC",
				"DriveAxleTemperature"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DriveAxleTemperature(-40), 
				    new DriveAxleTemperature(210),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-40),
				Long.valueOf(210)
			    ),
			    null
			)
		    ),
		    "driveAxleTemperature",
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
				"DriveAxleLubePressure"
			    ),
			    new QName (
				"DSRC",
				"DriveAxleLubePressure"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DriveAxleLubePressure(0), 
				    new DriveAxleLubePressure(250),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(250)
			    ),
			    null
			)
		    ),
		    "driveAxleLubePressure",
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
				"SteeringAxleLubePressure"
			    ),
			    new QName (
				"DSRC",
				"SteeringAxleLubePressure"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SteeringAxleLubePressure(0), 
				    new SteeringAxleLubePressure(250),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(250)
			    ),
			    null
			)
		    ),
		    "steeringAxleLubePressure",
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
     * Get the type descriptor (TypeInfo) of 'this' J1939data object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' J1939data object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for J1939data
