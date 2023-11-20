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
 * Define the ASN1 Type DTime from ASN1 Module DSRC.
 * @see Sequence
 */

public class DTime extends Sequence {
    
    /**
     * The default constructor.
     */
    public DTime()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DTime(DHour hour, DMinute minute, DSecond second, DOffset offset)
    {
	setHour(hour);
	setMinute(minute);
	setSecond(second);
	setOffset(offset);
    }
    
    /**
     * Construct with required components.
     */
    public DTime(DHour hour, DMinute minute, DSecond second)
    {
	setHour(hour);
	setMinute(minute);
	setSecond(second);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DHour();
	mComponents[1] = new DMinute();
	mComponents[2] = new DSecond();
	mComponents[3] = new DOffset();
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
		return new DHour();
	    case 1:
		return new DMinute();
	    case 2:
		return new DSecond();
	    case 3:
		return new DOffset();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "hour"
    public DHour getHour()
    {
	return (DHour)mComponents[0];
    }
    
    public void setHour(DHour hour)
    {
	mComponents[0] = hour;
    }
    
    
    // Methods for field "minute"
    public DMinute getMinute()
    {
	return (DMinute)mComponents[1];
    }
    
    public void setMinute(DMinute minute)
    {
	mComponents[1] = minute;
    }
    
    
    // Methods for field "second"
    public DSecond getSecond()
    {
	return (DSecond)mComponents[2];
    }
    
    public void setSecond(DSecond second)
    {
	mComponents[2] = second;
    }
    
    
    // Methods for field "offset"
    public DOffset getOffset()
    {
	return (DOffset)mComponents[3];
    }
    
    public void setOffset(DOffset offset)
    {
	mComponents[3] = offset;
    }
    
    public boolean hasOffset()
    {
	return componentIsPresent(3);
    }
    
    public void deleteOffset()
    {
	setComponentAbsent(3);
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
	    "DTime"
	),
	new QName (
	    "DSRC",
	    "DTime"
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
				"DHour"
			    ),
			    new QName (
				"DSRC",
				"DHour"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DHour(0), 
				    new DHour(31),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(31)
			    ),
			    null
			)
		    ),
		    "hour",
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
				"DMinute"
			    ),
			    new QName (
				"DSRC",
				"DMinute"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DMinute(0), 
				    new DMinute(60),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(60)
			    ),
			    null
			)
		    ),
		    "minute",
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
				"DSecond"
			    ),
			    new QName (
				"DSRC",
				"DSecond"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DSecond(0), 
				    new DSecond(65535),
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
		    "second",
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
				"DOffset"
			    ),
			    new QName (
				"DSRC",
				"DOffset"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DOffset(-840), 
				    new DOffset(840),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-840),
				Long.valueOf(840)
			    ),
			    null
			)
		    ),
		    "offset",
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DTime object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DTime object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for DTime
