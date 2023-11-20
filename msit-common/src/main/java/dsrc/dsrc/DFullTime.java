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
 * Define the ASN1 Type DFullTime from ASN1 Module DSRC.
 * @see Sequence
 */

public class DFullTime extends Sequence {
    
    /**
     * The default constructor.
     */
    public DFullTime()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DFullTime(DYear year, DMonth month, DDay day, DHour hour, 
		    DMinute minute)
    {
	setYear(year);
	setMonth(month);
	setDay(day);
	setHour(hour);
	setMinute(minute);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DYear();
	mComponents[1] = new DMonth();
	mComponents[2] = new DDay();
	mComponents[3] = new DHour();
	mComponents[4] = new DMinute();
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
		return new DYear();
	    case 1:
		return new DMonth();
	    case 2:
		return new DDay();
	    case 3:
		return new DHour();
	    case 4:
		return new DMinute();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "year"
    public DYear getYear()
    {
	return (DYear)mComponents[0];
    }
    
    public void setYear(DYear year)
    {
	mComponents[0] = year;
    }
    
    
    // Methods for field "month"
    public DMonth getMonth()
    {
	return (DMonth)mComponents[1];
    }
    
    public void setMonth(DMonth month)
    {
	mComponents[1] = month;
    }
    
    
    // Methods for field "day"
    public DDay getDay()
    {
	return (DDay)mComponents[2];
    }
    
    public void setDay(DDay day)
    {
	mComponents[2] = day;
    }
    
    
    // Methods for field "hour"
    public DHour getHour()
    {
	return (DHour)mComponents[3];
    }
    
    public void setHour(DHour hour)
    {
	mComponents[3] = hour;
    }
    
    
    // Methods for field "minute"
    public DMinute getMinute()
    {
	return (DMinute)mComponents[4];
    }
    
    public void setMinute(DMinute minute)
    {
	mComponents[4] = minute;
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
	    "DFullTime"
	),
	new QName (
	    "DSRC",
	    "DFullTime"
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
				"DYear"
			    ),
			    new QName (
				"DSRC",
				"DYear"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DYear(0), 
				    new DYear(4095),
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
		    "year",
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
				"DMonth"
			    ),
			    new QName (
				"DSRC",
				"DMonth"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DMonth(0), 
				    new DMonth(12),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(12)
			    ),
			    null
			)
		    ),
		    "month",
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
				"DDay"
			    ),
			    new QName (
				"DSRC",
				"DDay"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DDay(0), 
				    new DDay(31),
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
		    "day",
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
     * Get the type descriptor (TypeInfo) of 'this' DFullTime object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DFullTime object.
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
    
} // End class definition for DFullTime
