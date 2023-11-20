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
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type TireData from ASN1 Module DSRC.
 * @see Sequence
 */

public class TireData extends Sequence {
    
    /**
     * The default constructor.
     */
    public TireData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TireData(TireLocation location, TirePressure pressure, 
		    TireTemp temp, WheelSensorStatus wheelSensorStatus, 
		    WheelEndElectFault wheelEndElectFault, 
		    TireLeakageRate leakageRate, 
		    TirePressureThresholdDetection detection)
    {
	setLocation(location);
	setPressure(pressure);
	setTemp(temp);
	setWheelSensorStatus(wheelSensorStatus);
	setWheelEndElectFault(wheelEndElectFault);
	setLeakageRate(leakageRate);
	setDetection(detection);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TireLocation();
	mComponents[1] = new TirePressure();
	mComponents[2] = new TireTemp();
	mComponents[3] = WheelSensorStatus.off;
	mComponents[4] = WheelEndElectFault.isOk;
	mComponents[5] = new TireLeakageRate();
	mComponents[6] = TirePressureThresholdDetection.noData;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new TireLocation();
	    case 1:
		return new TirePressure();
	    case 2:
		return new TireTemp();
	    case 3:
		return WheelSensorStatus.off;
	    case 4:
		return WheelEndElectFault.isOk;
	    case 5:
		return new TireLeakageRate();
	    case 6:
		return TirePressureThresholdDetection.noData;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "location"
    public TireLocation getLocation()
    {
	return (TireLocation)mComponents[0];
    }
    
    public void setLocation(TireLocation location)
    {
	mComponents[0] = location;
    }
    
    public boolean hasLocation()
    {
	return componentIsPresent(0);
    }
    
    public void deleteLocation()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "pressure"
    public TirePressure getPressure()
    {
	return (TirePressure)mComponents[1];
    }
    
    public void setPressure(TirePressure pressure)
    {
	mComponents[1] = pressure;
    }
    
    public boolean hasPressure()
    {
	return componentIsPresent(1);
    }
    
    public void deletePressure()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "temp"
    public TireTemp getTemp()
    {
	return (TireTemp)mComponents[2];
    }
    
    public void setTemp(TireTemp temp)
    {
	mComponents[2] = temp;
    }
    
    public boolean hasTemp()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTemp()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "wheelSensorStatus"
    public WheelSensorStatus getWheelSensorStatus()
    {
	return (WheelSensorStatus)mComponents[3];
    }
    
    public void setWheelSensorStatus(WheelSensorStatus wheelSensorStatus)
    {
	mComponents[3] = wheelSensorStatus;
    }
    
    public boolean hasWheelSensorStatus()
    {
	return componentIsPresent(3);
    }
    
    public void deleteWheelSensorStatus()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "wheelEndElectFault"
    public WheelEndElectFault getWheelEndElectFault()
    {
	return (WheelEndElectFault)mComponents[4];
    }
    
    public void setWheelEndElectFault(WheelEndElectFault wheelEndElectFault)
    {
	mComponents[4] = wheelEndElectFault;
    }
    
    public boolean hasWheelEndElectFault()
    {
	return componentIsPresent(4);
    }
    
    public void deleteWheelEndElectFault()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "leakageRate"
    public TireLeakageRate getLeakageRate()
    {
	return (TireLeakageRate)mComponents[5];
    }
    
    public void setLeakageRate(TireLeakageRate leakageRate)
    {
	mComponents[5] = leakageRate;
    }
    
    public boolean hasLeakageRate()
    {
	return componentIsPresent(5);
    }
    
    public void deleteLeakageRate()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "detection"
    public TirePressureThresholdDetection getDetection()
    {
	return (TirePressureThresholdDetection)mComponents[6];
    }
    
    public void setDetection(TirePressureThresholdDetection detection)
    {
	mComponents[6] = detection;
    }
    
    public boolean hasDetection()
    {
	return componentIsPresent(6);
    }
    
    public void deleteDetection()
    {
	setComponentAbsent(6);
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
	    "TireData"
	),
	new QName (
	    "DSRC",
	    "TireData"
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
				"TireLocation"
			    ),
			    new QName (
				"DSRC",
				"TireLocation"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TireLocation(0), 
				    new TireLocation(255),
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
		    "location",
		    0,
		    3,
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
				"TirePressure"
			    ),
			    new QName (
				"DSRC",
				"TirePressure"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TirePressure(0), 
				    new TirePressure(250),
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
		    "pressure",
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
				"TireTemp"
			    ),
			    new QName (
				"DSRC",
				"TireTemp"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TireTemp(-8736), 
				    new TireTemp(55519),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-8736),
				Long.valueOf(55519)
			    ),
			    null
			)
		    ),
		    "temp",
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
				"WheelSensorStatus"
			    ),
			    new QName (
				"DSRC",
				"WheelSensorStatus"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"off",
					0
				    ),
				    new MemberListElement (
					"on",
					1
				    ),
				    new MemberListElement (
					"notDefined",
					2
				    ),
				    new MemberListElement (
					"notSupported",
					3
				    )
				}
			    ),
			    0,
			    WheelSensorStatus.off
			)
		    ),
		    "wheelSensorStatus",
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
				"WheelEndElectFault"
			    ),
			    new QName (
				"DSRC",
				"WheelEndElectFault"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"isOk",
					0
				    ),
				    new MemberListElement (
					"isNotDefined",
					1
				    ),
				    new MemberListElement (
					"isError",
					2
				    ),
				    new MemberListElement (
					"isNotSupported",
					3
				    )
				}
			    ),
			    0,
			    WheelEndElectFault.isOk
			)
		    ),
		    "wheelEndElectFault",
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
				"TireLeakageRate"
			    ),
			    new QName (
				"DSRC",
				"TireLeakageRate"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TireLeakageRate(0), 
				    new TireLeakageRate(64255),
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
		    "leakageRate",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"TirePressureThresholdDetection"
			    ),
			    new QName (
				"DSRC",
				"TirePressureThresholdDetection"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"noData",
					0
				    ),
				    new MemberListElement (
					"overPressure",
					1
				    ),
				    new MemberListElement (
					"noWarningPressure",
					2
				    ),
				    new MemberListElement (
					"underPressure",
					3
				    ),
				    new MemberListElement (
					"extremeUnderPressure",
					4
				    ),
				    new MemberListElement (
					"undefined",
					5
				    ),
				    new MemberListElement (
					"errorIndicator",
					6
				    ),
				    new MemberListElement (
					"notAvailable",
					7
				    )
				}
			    ),
			    0,
			    TirePressureThresholdDetection.noData
			)
		    ),
		    "detection",
		    6,
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
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TireData object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TireData object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TireData
