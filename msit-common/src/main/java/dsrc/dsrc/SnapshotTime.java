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
 * Define the ASN1 Type SnapshotTime from ASN1 Module DSRC.
 * @see Sequence
 */

public class SnapshotTime extends Sequence {
    
    /**
     * The default constructor.
     */
    public SnapshotTime()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SnapshotTime(GrossSpeed speed1, SecondOfTime time1, 
		    GrossSpeed speed2, SecondOfTime time2)
    {
	setSpeed1(speed1);
	setTime1(time1);
	setSpeed2(speed2);
	setTime2(time2);
    }
    
    public void initComponents()
    {
	mComponents[0] = new GrossSpeed();
	mComponents[1] = new SecondOfTime();
	mComponents[2] = new GrossSpeed();
	mComponents[3] = new SecondOfTime();
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
		return new GrossSpeed();
	    case 1:
		return new SecondOfTime();
	    case 2:
		return new GrossSpeed();
	    case 3:
		return new SecondOfTime();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "speed1"
    public GrossSpeed getSpeed1()
    {
	return (GrossSpeed)mComponents[0];
    }
    
    public void setSpeed1(GrossSpeed speed1)
    {
	mComponents[0] = speed1;
    }
    
    
    // Methods for field "time1"
    public SecondOfTime getTime1()
    {
	return (SecondOfTime)mComponents[1];
    }
    
    public void setTime1(SecondOfTime time1)
    {
	mComponents[1] = time1;
    }
    
    
    // Methods for field "speed2"
    public GrossSpeed getSpeed2()
    {
	return (GrossSpeed)mComponents[2];
    }
    
    public void setSpeed2(GrossSpeed speed2)
    {
	mComponents[2] = speed2;
    }
    
    
    // Methods for field "time2"
    public SecondOfTime getTime2()
    {
	return (SecondOfTime)mComponents[3];
    }
    
    public void setTime2(SecondOfTime time2)
    {
	mComponents[3] = time2;
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
	    "SnapshotTime"
	),
	new QName (
	    "DSRC",
	    "SnapshotTime"
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
				"GrossSpeed"
			    ),
			    new QName (
				"DSRC",
				"GrossSpeed"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new GrossSpeed(0), 
				    new GrossSpeed(31),
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
		    "speed1",
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
				"SecondOfTime"
			    ),
			    new QName (
				"DSRC",
				"SecondOfTime"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SecondOfTime(0), 
				    new SecondOfTime(61),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(61)
			    ),
			    null
			)
		    ),
		    "time1",
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
				"GrossSpeed"
			    ),
			    new QName (
				"DSRC",
				"GrossSpeed"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new GrossSpeed(0), 
				    new GrossSpeed(31),
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
		    "speed2",
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
				"SecondOfTime"
			    ),
			    new QName (
				"DSRC",
				"SecondOfTime"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SecondOfTime(0), 
				    new SecondOfTime(61),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(61)
			    ),
			    null
			)
		    ),
		    "time2",
		    3,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SnapshotTime object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SnapshotTime object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SnapshotTime
