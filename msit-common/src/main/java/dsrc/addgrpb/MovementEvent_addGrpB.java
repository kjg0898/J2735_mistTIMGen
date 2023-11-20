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


package dsrc.addgrpb;

import com.oss.asn1.AbstractData;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type MovementEvent_addGrpB from ASN1 Module AddGrpB.
 * @see Sequence
 */

public class MovementEvent_addGrpB extends Sequence {
    
    /**
     * The default constructor.
     */
    public MovementEvent_addGrpB()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MovementEvent_addGrpB(TimeRemaining startTime, 
		    MinTimetoChange minEndTime, MaxTimetoChange maxEndTime, 
		    TimeRemaining likelyTime, 
		    dsrc.dsrc.TimeIntervalConfidence confidence, 
		    TimeRemaining nextTime)
    {
	setStartTime(startTime);
	setMinEndTime(minEndTime);
	setMaxEndTime(maxEndTime);
	setLikelyTime(likelyTime);
	setConfidence(confidence);
	setNextTime(nextTime);
    }
    
    /**
     * Construct with required components.
     */
    public MovementEvent_addGrpB(MinTimetoChange minEndTime)
    {
	setMinEndTime(minEndTime);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TimeRemaining();
	mComponents[1] = new MinTimetoChange();
	mComponents[2] = new MaxTimetoChange();
	mComponents[3] = new TimeRemaining();
	mComponents[4] = new dsrc.dsrc.TimeIntervalConfidence();
	mComponents[5] = new TimeRemaining();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new TimeRemaining();
	    case 1:
		return new MinTimetoChange();
	    case 2:
		return new MaxTimetoChange();
	    case 3:
		return new TimeRemaining();
	    case 4:
		return new dsrc.dsrc.TimeIntervalConfidence();
	    case 5:
		return new TimeRemaining();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "startTime"
    public TimeRemaining getStartTime()
    {
	return (TimeRemaining)mComponents[0];
    }
    
    public void setStartTime(TimeRemaining startTime)
    {
	mComponents[0] = startTime;
    }
    
    public boolean hasStartTime()
    {
	return componentIsPresent(0);
    }
    
    public void deleteStartTime()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "minEndTime"
    public MinTimetoChange getMinEndTime()
    {
	return (MinTimetoChange)mComponents[1];
    }
    
    public void setMinEndTime(MinTimetoChange minEndTime)
    {
	mComponents[1] = minEndTime;
    }
    
    
    // Methods for field "maxEndTime"
    public MaxTimetoChange getMaxEndTime()
    {
	return (MaxTimetoChange)mComponents[2];
    }
    
    public void setMaxEndTime(MaxTimetoChange maxEndTime)
    {
	mComponents[2] = maxEndTime;
    }
    
    public boolean hasMaxEndTime()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMaxEndTime()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "likelyTime"
    public TimeRemaining getLikelyTime()
    {
	return (TimeRemaining)mComponents[3];
    }
    
    public void setLikelyTime(TimeRemaining likelyTime)
    {
	mComponents[3] = likelyTime;
    }
    
    public boolean hasLikelyTime()
    {
	return componentIsPresent(3);
    }
    
    public void deleteLikelyTime()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "confidence"
    public dsrc.dsrc.TimeIntervalConfidence getConfidence()
    {
	return (dsrc.dsrc.TimeIntervalConfidence)mComponents[4];
    }
    
    public void setConfidence(dsrc.dsrc.TimeIntervalConfidence confidence)
    {
	mComponents[4] = confidence;
    }
    
    public boolean hasConfidence()
    {
	return componentIsPresent(4);
    }
    
    public void deleteConfidence()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "nextTime"
    public TimeRemaining getNextTime()
    {
	return (TimeRemaining)mComponents[5];
    }
    
    public void setNextTime(TimeRemaining nextTime)
    {
	mComponents[5] = nextTime;
    }
    
    public boolean hasNextTime()
    {
	return componentIsPresent(5);
    }
    
    public void deleteNextTime()
    {
	setComponentAbsent(5);
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
	    "dsrc.addgrpb",
	    "MovementEvent_addGrpB"
	),
	new QName (
	    "AddGrpB",
	    "MovementEvent-addGrpB"
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
				"dsrc.addgrpb",
				"TimeRemaining"
			    ),
			    new QName (
				"AddGrpB",
				"TimeRemaining"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TimeRemaining(0), 
				    new TimeRemaining(9001),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(9001)
			    ),
			    null
			)
		    ),
		    "startTime",
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
				"dsrc.addgrpb",
				"MinTimetoChange"
			    ),
			    new QName (
				"AddGrpB",
				"MinTimetoChange"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MinTimetoChange(0), 
				    new MinTimetoChange(2402),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(2402)
			    ),
			    null
			)
		    ),
		    "minEndTime",
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
				"dsrc.addgrpb",
				"MaxTimetoChange"
			    ),
			    new QName (
				"AddGrpB",
				"MaxTimetoChange"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MaxTimetoChange(0), 
				    new MaxTimetoChange(2402),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(2402)
			    ),
			    null
			)
		    ),
		    "maxEndTime",
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
				"dsrc.addgrpb",
				"TimeRemaining"
			    ),
			    new QName (
				"AddGrpB",
				"TimeRemaining"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TimeRemaining(0), 
				    new TimeRemaining(9001),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(9001)
			    ),
			    null
			)
		    ),
		    "likelyTime",
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
				"TimeIntervalConfidence"
			    ),
			    new QName (
				"DSRC",
				"TimeIntervalConfidence"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new dsrc.dsrc.TimeIntervalConfidence(0), 
				    new dsrc.dsrc.TimeIntervalConfidence(15),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(15)
			    ),
			    null
			)
		    ),
		    "confidence",
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
				"dsrc.addgrpb",
				"TimeRemaining"
			    ),
			    new QName (
				"AddGrpB",
				"TimeRemaining"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TimeRemaining(0), 
				    new TimeRemaining(9001),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(9001)
			    ),
			    null
			)
		    ),
		    "nextTime",
		    5,
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
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MovementEvent_addGrpB object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MovementEvent_addGrpB object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MovementEvent_addGrpB
