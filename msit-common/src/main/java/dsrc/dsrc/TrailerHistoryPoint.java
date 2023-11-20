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
 * Define the ASN1 Type TrailerHistoryPoint from ASN1 Module DSRC.
 * @see Sequence
 */

public class TrailerHistoryPoint extends Sequence {
    
    /**
     * The default constructor.
     */
    public TrailerHistoryPoint()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TrailerHistoryPoint(Angle pivotAngle, TimeOffset timeOffset, 
		    Node_XY_24b positionOffset, 
		    VertOffset_B07 elevationOffset, CoarseHeading heading)
    {
	setPivotAngle(pivotAngle);
	setTimeOffset(timeOffset);
	setPositionOffset(positionOffset);
	setElevationOffset(elevationOffset);
	setHeading(heading);
    }
    
    /**
     * Construct with required components.
     */
    public TrailerHistoryPoint(Angle pivotAngle, TimeOffset timeOffset, 
		    Node_XY_24b positionOffset)
    {
	setPivotAngle(pivotAngle);
	setTimeOffset(timeOffset);
	setPositionOffset(positionOffset);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Angle();
	mComponents[1] = new TimeOffset();
	mComponents[2] = new Node_XY_24b();
	mComponents[3] = new VertOffset_B07();
	mComponents[4] = new CoarseHeading();
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
		return new Angle();
	    case 1:
		return new TimeOffset();
	    case 2:
		return new Node_XY_24b();
	    case 3:
		return new VertOffset_B07();
	    case 4:
		return new CoarseHeading();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "pivotAngle"
    public Angle getPivotAngle()
    {
	return (Angle)mComponents[0];
    }
    
    public void setPivotAngle(Angle pivotAngle)
    {
	mComponents[0] = pivotAngle;
    }
    
    
    // Methods for field "timeOffset"
    public TimeOffset getTimeOffset()
    {
	return (TimeOffset)mComponents[1];
    }
    
    public void setTimeOffset(TimeOffset timeOffset)
    {
	mComponents[1] = timeOffset;
    }
    
    
    // Methods for field "positionOffset"
    public Node_XY_24b getPositionOffset()
    {
	return (Node_XY_24b)mComponents[2];
    }
    
    public void setPositionOffset(Node_XY_24b positionOffset)
    {
	mComponents[2] = positionOffset;
    }
    
    
    // Methods for field "elevationOffset"
    public VertOffset_B07 getElevationOffset()
    {
	return (VertOffset_B07)mComponents[3];
    }
    
    public void setElevationOffset(VertOffset_B07 elevationOffset)
    {
	mComponents[3] = elevationOffset;
    }
    
    public boolean hasElevationOffset()
    {
	return componentIsPresent(3);
    }
    
    public void deleteElevationOffset()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "heading"
    public CoarseHeading getHeading()
    {
	return (CoarseHeading)mComponents[4];
    }
    
    public void setHeading(CoarseHeading heading)
    {
	mComponents[4] = heading;
    }
    
    public boolean hasHeading()
    {
	return componentIsPresent(4);
    }
    
    public void deleteHeading()
    {
	setComponentAbsent(4);
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
	    "TrailerHistoryPoint"
	),
	new QName (
	    "DSRC",
	    "TrailerHistoryPoint"
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
		    "pivotAngle",
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
				"Node_XY_24b"
			    ),
			    new QName (
				"DSRC",
				"Node-XY-24b"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_XY_24b"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_XY_24b"
				)
			    ),
			    0
			)
		    ),
		    "positionOffset",
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
				"VertOffset_B07"
			    ),
			    new QName (
				"DSRC",
				"VertOffset-B07"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new VertOffset_B07(-64), 
				    new VertOffset_B07(63),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-64),
				Long.valueOf(63)
			    ),
			    null
			)
		    ),
		    "elevationOffset",
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
     * Get the type descriptor (TypeInfo) of 'this' TrailerHistoryPoint object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TrailerHistoryPoint object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TrailerHistoryPoint
