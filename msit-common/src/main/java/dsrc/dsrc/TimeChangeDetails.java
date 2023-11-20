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
 * Define the ASN1 Type TimeChangeDetails from ASN1 Module DSRC.
 * @see Sequence
 */

public class TimeChangeDetails extends Sequence {
    
    /**
     * The default constructor.
     */
    public TimeChangeDetails()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TimeChangeDetails(TimeMark startTime, TimeMark minEndTime, 
		    TimeMark maxEndTime, TimeMark likelyTime, 
		    TimeIntervalConfidence confidence, TimeMark nextTime)
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
    public TimeChangeDetails(TimeMark minEndTime)
    {
	setMinEndTime(minEndTime);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TimeMark();
	mComponents[1] = new TimeMark();
	mComponents[2] = new TimeMark();
	mComponents[3] = new TimeMark();
	mComponents[4] = new TimeIntervalConfidence();
	mComponents[5] = new TimeMark();
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
		return new TimeMark();
	    case 1:
		return new TimeMark();
	    case 2:
		return new TimeMark();
	    case 3:
		return new TimeMark();
	    case 4:
		return new TimeIntervalConfidence();
	    case 5:
		return new TimeMark();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "startTime"
    public TimeMark getStartTime()
    {
	return (TimeMark)mComponents[0];
    }
    
    public void setStartTime(TimeMark startTime)
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
    public TimeMark getMinEndTime()
    {
	return (TimeMark)mComponents[1];
    }
    
    public void setMinEndTime(TimeMark minEndTime)
    {
	mComponents[1] = minEndTime;
    }
    
    
    // Methods for field "maxEndTime"
    public TimeMark getMaxEndTime()
    {
	return (TimeMark)mComponents[2];
    }
    
    public void setMaxEndTime(TimeMark maxEndTime)
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
    public TimeMark getLikelyTime()
    {
	return (TimeMark)mComponents[3];
    }
    
    public void setLikelyTime(TimeMark likelyTime)
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
    public TimeIntervalConfidence getConfidence()
    {
	return (TimeIntervalConfidence)mComponents[4];
    }
    
    public void setConfidence(TimeIntervalConfidence confidence)
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
    public TimeMark getNextTime()
    {
	return (TimeMark)mComponents[5];
    }
    
    public void setNextTime(TimeMark nextTime)
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
	    "dsrc.dsrc",
	    "TimeChangeDetails"
	),
	new QName (
	    "DSRC",
	    "TimeChangeDetails"
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
				"TimeMark"
			    ),
			    new QName (
				"DSRC",
				"TimeMark"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TimeMark(0), 
				    new TimeMark(36001),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(36001)
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
				"dsrc.dsrc",
				"TimeMark"
			    ),
			    new QName (
				"DSRC",
				"TimeMark"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TimeMark(0), 
				    new TimeMark(36001),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(36001)
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
				"dsrc.dsrc",
				"TimeMark"
			    ),
			    new QName (
				"DSRC",
				"TimeMark"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TimeMark(0), 
				    new TimeMark(36001),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(36001)
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
				"dsrc.dsrc",
				"TimeMark"
			    ),
			    new QName (
				"DSRC",
				"TimeMark"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TimeMark(0), 
				    new TimeMark(36001),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(36001)
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
				    new TimeIntervalConfidence(0), 
				    new TimeIntervalConfidence(15),
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
				"dsrc.dsrc",
				"TimeMark"
			    ),
			    new QName (
				"DSRC",
				"TimeMark"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TimeMark(0), 
				    new TimeMark(36001),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(36001)
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
     * Get the type descriptor (TypeInfo) of 'this' TimeChangeDetails object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TimeChangeDetails object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TimeChangeDetails
