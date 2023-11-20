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
 * Define the ASN1 Type PathHistoryPoint from ASN1 Module DSRC.
 * @see Sequence
 */

public class PathHistoryPoint extends Sequence {
    
    /**
     * The default constructor.
     */
    public PathHistoryPoint()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PathHistoryPoint(OffsetLL_B18 latOffset, OffsetLL_B18 lonOffset, 
		    VertOffset_B12 elevationOffset, TimeOffset timeOffset, 
		    Speed speed, PositionalAccuracy posAccuracy, 
		    CoarseHeading heading)
    {
	setLatOffset(latOffset);
	setLonOffset(lonOffset);
	setElevationOffset(elevationOffset);
	setTimeOffset(timeOffset);
	setSpeed(speed);
	setPosAccuracy(posAccuracy);
	setHeading(heading);
    }
    
    /**
     * Construct with required components.
     */
    public PathHistoryPoint(OffsetLL_B18 latOffset, OffsetLL_B18 lonOffset, 
		    VertOffset_B12 elevationOffset, TimeOffset timeOffset)
    {
	setLatOffset(latOffset);
	setLonOffset(lonOffset);
	setElevationOffset(elevationOffset);
	setTimeOffset(timeOffset);
    }
    
    public void initComponents()
    {
	mComponents[0] = new OffsetLL_B18();
	mComponents[1] = new OffsetLL_B18();
	mComponents[2] = new VertOffset_B12();
	mComponents[3] = new TimeOffset();
	mComponents[4] = new Speed();
	mComponents[5] = new PositionalAccuracy();
	mComponents[6] = new CoarseHeading();
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
		return new OffsetLL_B18();
	    case 1:
		return new OffsetLL_B18();
	    case 2:
		return new VertOffset_B12();
	    case 3:
		return new TimeOffset();
	    case 4:
		return new Speed();
	    case 5:
		return new PositionalAccuracy();
	    case 6:
		return new CoarseHeading();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "latOffset"
    public OffsetLL_B18 getLatOffset()
    {
	return (OffsetLL_B18)mComponents[0];
    }
    
    public void setLatOffset(OffsetLL_B18 latOffset)
    {
	mComponents[0] = latOffset;
    }
    
    
    // Methods for field "lonOffset"
    public OffsetLL_B18 getLonOffset()
    {
	return (OffsetLL_B18)mComponents[1];
    }
    
    public void setLonOffset(OffsetLL_B18 lonOffset)
    {
	mComponents[1] = lonOffset;
    }
    
    
    // Methods for field "elevationOffset"
    public VertOffset_B12 getElevationOffset()
    {
	return (VertOffset_B12)mComponents[2];
    }
    
    public void setElevationOffset(VertOffset_B12 elevationOffset)
    {
	mComponents[2] = elevationOffset;
    }
    
    
    // Methods for field "timeOffset"
    public TimeOffset getTimeOffset()
    {
	return (TimeOffset)mComponents[3];
    }
    
    public void setTimeOffset(TimeOffset timeOffset)
    {
	mComponents[3] = timeOffset;
    }
    
    
    // Methods for field "speed"
    public Speed getSpeed()
    {
	return (Speed)mComponents[4];
    }
    
    public void setSpeed(Speed speed)
    {
	mComponents[4] = speed;
    }
    
    public boolean hasSpeed()
    {
	return componentIsPresent(4);
    }
    
    public void deleteSpeed()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "posAccuracy"
    public PositionalAccuracy getPosAccuracy()
    {
	return (PositionalAccuracy)mComponents[5];
    }
    
    public void setPosAccuracy(PositionalAccuracy posAccuracy)
    {
	mComponents[5] = posAccuracy;
    }
    
    public boolean hasPosAccuracy()
    {
	return componentIsPresent(5);
    }
    
    public void deletePosAccuracy()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "heading"
    public CoarseHeading getHeading()
    {
	return (CoarseHeading)mComponents[6];
    }
    
    public void setHeading(CoarseHeading heading)
    {
	mComponents[6] = heading;
    }
    
    public boolean hasHeading()
    {
	return componentIsPresent(6);
    }
    
    public void deleteHeading()
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
	    "PathHistoryPoint"
	),
	new QName (
	    "DSRC",
	    "PathHistoryPoint"
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
				"OffsetLL_B18"
			    ),
			    new QName (
				"DSRC",
				"OffsetLL-B18"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new OffsetLL_B18(-131072), 
				    new OffsetLL_B18(131071),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-131072),
				Long.valueOf(131071)
			    ),
			    null
			)
		    ),
		    "latOffset",
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
				"OffsetLL_B18"
			    ),
			    new QName (
				"DSRC",
				"OffsetLL-B18"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new OffsetLL_B18(-131072), 
				    new OffsetLL_B18(131071),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-131072),
				Long.valueOf(131071)
			    ),
			    null
			)
		    ),
		    "lonOffset",
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
				"VertOffset_B12"
			    ),
			    new QName (
				"DSRC",
				"VertOffset-B12"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new VertOffset_B12(-2048), 
				    new VertOffset_B12(2047),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-2048),
				Long.valueOf(2047)
			    ),
			    null
			)
		    ),
		    "elevationOffset",
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
				"TimeOffset"
			    ),
			    new QName (
				"DSRC",
				"TimeOffset"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TimeOffset(1), 
				    new TimeOffset(65535),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(65535)
			    ),
			    null
			)
		    ),
		    "timeOffset",
		    3,
		    2,
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
				"Speed"
			    ),
			    new QName (
				"DSRC",
				"Speed"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Speed(0), 
				    new Speed(8191),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(8191)
			    ),
			    null
			)
		    ),
		    "speed",
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
				"PositionalAccuracy"
			    ),
			    new QName (
				"DSRC",
				"PositionalAccuracy"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "PositionalAccuracy"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "PositionalAccuracy"
				)
			    ),
			    0
			)
		    ),
		    "posAccuracy",
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
				"CoarseHeading"
			    ),
			    new QName (
				"DSRC",
				"CoarseHeading"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CoarseHeading(0), 
				    new CoarseHeading(240),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(240)
			    ),
			    null
			)
		    ),
		    "heading",
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
     * Get the type descriptor (TypeInfo) of 'this' PathHistoryPoint object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PathHistoryPoint object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PathHistoryPoint
