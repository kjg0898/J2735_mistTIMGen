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
 * Define the ASN1 Type TrailerUnitDescription from ASN1 Module DSRC.
 * @see Sequence
 */

public class TrailerUnitDescription extends Sequence {
    
    /**
     * The default constructor.
     */
    public TrailerUnitDescription()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TrailerUnitDescription(IsDolly isDolly, VehicleWidth width, 
		    VehicleLength length, VehicleHeight height, 
		    TrailerMass mass, BumperHeights bumperHeights, 
		    VehicleHeight centerOfGravity, 
		    PivotPointDescription frontPivot, 
		    PivotPointDescription rearPivot, 
		    Offset_B12 rearWheelOffset, Node_XY_24b positionOffset, 
		    VertOffset_B07 elevationOffset, 
		    TrailerHistoryPointList crumbData)
    {
	setIsDolly(isDolly);
	setWidth(width);
	setLength(length);
	setHeight(height);
	setMass(mass);
	setBumperHeights(bumperHeights);
	setCenterOfGravity(centerOfGravity);
	setFrontPivot(frontPivot);
	setRearPivot(rearPivot);
	setRearWheelOffset(rearWheelOffset);
	setPositionOffset(positionOffset);
	setElevationOffset(elevationOffset);
	setCrumbData(crumbData);
    }
    
    /**
     * Construct with required components.
     */
    public TrailerUnitDescription(IsDolly isDolly, VehicleWidth width, 
		    VehicleLength length, PivotPointDescription frontPivot, 
		    Node_XY_24b positionOffset)
    {
	setIsDolly(isDolly);
	setWidth(width);
	setLength(length);
	setFrontPivot(frontPivot);
	setPositionOffset(positionOffset);
    }
    
    public void initComponents()
    {
	mComponents[0] = new IsDolly();
	mComponents[1] = new VehicleWidth();
	mComponents[2] = new VehicleLength();
	mComponents[3] = new VehicleHeight();
	mComponents[4] = new TrailerMass();
	mComponents[5] = new BumperHeights();
	mComponents[6] = new VehicleHeight();
	mComponents[7] = new PivotPointDescription();
	mComponents[8] = new PivotPointDescription();
	mComponents[9] = new Offset_B12();
	mComponents[10] = new Node_XY_24b();
	mComponents[11] = new VertOffset_B07();
	mComponents[12] = new TrailerHistoryPointList();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[13];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new IsDolly();
	    case 1:
		return new VehicleWidth();
	    case 2:
		return new VehicleLength();
	    case 3:
		return new VehicleHeight();
	    case 4:
		return new TrailerMass();
	    case 5:
		return new BumperHeights();
	    case 6:
		return new VehicleHeight();
	    case 7:
		return new PivotPointDescription();
	    case 8:
		return new PivotPointDescription();
	    case 9:
		return new Offset_B12();
	    case 10:
		return new Node_XY_24b();
	    case 11:
		return new VertOffset_B07();
	    case 12:
		return new TrailerHistoryPointList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "isDolly"
    public IsDolly getIsDolly()
    {
	return (IsDolly)mComponents[0];
    }
    
    public void setIsDolly(IsDolly isDolly)
    {
	mComponents[0] = isDolly;
    }
    
    
    // Methods for field "width"
    public VehicleWidth getWidth()
    {
	return (VehicleWidth)mComponents[1];
    }
    
    public void setWidth(VehicleWidth width)
    {
	mComponents[1] = width;
    }
    
    
    // Methods for field "length"
    public VehicleLength getLength()
    {
	return (VehicleLength)mComponents[2];
    }
    
    public void setLength(VehicleLength length)
    {
	mComponents[2] = length;
    }
    
    
    // Methods for field "height"
    public VehicleHeight getHeight()
    {
	return (VehicleHeight)mComponents[3];
    }
    
    public void setHeight(VehicleHeight height)
    {
	mComponents[3] = height;
    }
    
    public boolean hasHeight()
    {
	return componentIsPresent(3);
    }
    
    public void deleteHeight()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "mass"
    public TrailerMass getMass()
    {
	return (TrailerMass)mComponents[4];
    }
    
    public void setMass(TrailerMass mass)
    {
	mComponents[4] = mass;
    }
    
    public boolean hasMass()
    {
	return componentIsPresent(4);
    }
    
    public void deleteMass()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "bumperHeights"
    public BumperHeights getBumperHeights()
    {
	return (BumperHeights)mComponents[5];
    }
    
    public void setBumperHeights(BumperHeights bumperHeights)
    {
	mComponents[5] = bumperHeights;
    }
    
    public boolean hasBumperHeights()
    {
	return componentIsPresent(5);
    }
    
    public void deleteBumperHeights()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "centerOfGravity"
    public VehicleHeight getCenterOfGravity()
    {
	return (VehicleHeight)mComponents[6];
    }
    
    public void setCenterOfGravity(VehicleHeight centerOfGravity)
    {
	mComponents[6] = centerOfGravity;
    }
    
    public boolean hasCenterOfGravity()
    {
	return componentIsPresent(6);
    }
    
    public void deleteCenterOfGravity()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "frontPivot"
    public PivotPointDescription getFrontPivot()
    {
	return (PivotPointDescription)mComponents[7];
    }
    
    public void setFrontPivot(PivotPointDescription frontPivot)
    {
	mComponents[7] = frontPivot;
    }
    
    
    // Methods for field "rearPivot"
    public PivotPointDescription getRearPivot()
    {
	return (PivotPointDescription)mComponents[8];
    }
    
    public void setRearPivot(PivotPointDescription rearPivot)
    {
	mComponents[8] = rearPivot;
    }
    
    public boolean hasRearPivot()
    {
	return componentIsPresent(8);
    }
    
    public void deleteRearPivot()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "rearWheelOffset"
    public Offset_B12 getRearWheelOffset()
    {
	return (Offset_B12)mComponents[9];
    }
    
    public void setRearWheelOffset(Offset_B12 rearWheelOffset)
    {
	mComponents[9] = rearWheelOffset;
    }
    
    public boolean hasRearWheelOffset()
    {
	return componentIsPresent(9);
    }
    
    public void deleteRearWheelOffset()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "positionOffset"
    public Node_XY_24b getPositionOffset()
    {
	return (Node_XY_24b)mComponents[10];
    }
    
    public void setPositionOffset(Node_XY_24b positionOffset)
    {
	mComponents[10] = positionOffset;
    }
    
    
    // Methods for field "elevationOffset"
    public VertOffset_B07 getElevationOffset()
    {
	return (VertOffset_B07)mComponents[11];
    }
    
    public void setElevationOffset(VertOffset_B07 elevationOffset)
    {
	mComponents[11] = elevationOffset;
    }
    
    public boolean hasElevationOffset()
    {
	return componentIsPresent(11);
    }
    
    public void deleteElevationOffset()
    {
	setComponentAbsent(11);
    }
    
    
    // Methods for field "crumbData"
    public TrailerHistoryPointList getCrumbData()
    {
	return (TrailerHistoryPointList)mComponents[12];
    }
    
    public void setCrumbData(TrailerHistoryPointList crumbData)
    {
	mComponents[12] = crumbData;
    }
    
    public boolean hasCrumbData()
    {
	return componentIsPresent(12);
    }
    
    public void deleteCrumbData()
    {
	setComponentAbsent(12);
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
	    "TrailerUnitDescription"
	),
	new QName (
	    "DSRC",
	    "TrailerUnitDescription"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"IsDolly"
			    ),
			    new QName (
				"DSRC",
				"IsDolly"
			    ),
			    274450,
			    null
			)
		    ),
		    "isDolly",
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
				"VehicleWidth"
			    ),
			    new QName (
				"DSRC",
				"VehicleWidth"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new VehicleWidth(0), 
				    new VehicleWidth(1023),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(1023)
			    ),
			    null
			)
		    ),
		    "width",
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
				"VehicleLength"
			    ),
			    new QName (
				"DSRC",
				"VehicleLength"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new VehicleLength(0), 
				    new VehicleLength(4095),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(4095)
			    ),
			    null
			)
		    ),
		    "length",
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
				"TrailerMass"
			    ),
			    new QName (
				"DSRC",
				"TrailerMass"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TrailerMass(0), 
				    new TrailerMass(255),
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
		    "bumperHeights",
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
		    "centerOfGravity",
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
				"PivotPointDescription"
			    ),
			    new QName (
				"DSRC",
				"PivotPointDescription"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "PivotPointDescription"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "PivotPointDescription"
				)
			    ),
			    0
			)
		    ),
		    "frontPivot",
		    7,
		    2,
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
				"PivotPointDescription"
			    ),
			    new QName (
				"DSRC",
				"PivotPointDescription"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "PivotPointDescription"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "PivotPointDescription"
				)
			    ),
			    0
			)
		    ),
		    "rearPivot",
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
				"Offset_B12"
			    ),
			    new QName (
				"DSRC",
				"Offset-B12"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Offset_B12(-2048), 
				    new Offset_B12(2047),
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
		    "rearWheelOffset",
		    9,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
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
		    10,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
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
		    11,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"TrailerHistoryPointList"
			    ),
			    new QName (
				"DSRC",
				"TrailerHistoryPointList"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(23),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(23)
			    ),
			    new TypeInfoRef (
				new QName (
				    "dsrc.dsrc",
				    "TrailerHistoryPoint"
				)
			    )
			)
		    ),
		    "crumbData",
		    12,
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
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TrailerUnitDescription object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TrailerUnitDescription object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TrailerUnitDescription
