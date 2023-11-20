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
 * Define the ASN1 Type SnapshotDistance from ASN1 Module DSRC.
 * @see Sequence
 */

public class SnapshotDistance extends Sequence {
    
    /**
     * The default constructor.
     */
    public SnapshotDistance()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SnapshotDistance(GrossDistance distance1, GrossSpeed speed1, 
		    GrossDistance distance2, GrossSpeed speed2)
    {
	setDistance1(distance1);
	setSpeed1(speed1);
	setDistance2(distance2);
	setSpeed2(speed2);
    }
    
    public void initComponents()
    {
	mComponents[0] = new GrossDistance();
	mComponents[1] = new GrossSpeed();
	mComponents[2] = new GrossDistance();
	mComponents[3] = new GrossSpeed();
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
		return new GrossDistance();
	    case 1:
		return new GrossSpeed();
	    case 2:
		return new GrossDistance();
	    case 3:
		return new GrossSpeed();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "distance1"
    public GrossDistance getDistance1()
    {
	return (GrossDistance)mComponents[0];
    }
    
    public void setDistance1(GrossDistance distance1)
    {
	mComponents[0] = distance1;
    }
    
    
    // Methods for field "speed1"
    public GrossSpeed getSpeed1()
    {
	return (GrossSpeed)mComponents[1];
    }
    
    public void setSpeed1(GrossSpeed speed1)
    {
	mComponents[1] = speed1;
    }
    
    
    // Methods for field "distance2"
    public GrossDistance getDistance2()
    {
	return (GrossDistance)mComponents[2];
    }
    
    public void setDistance2(GrossDistance distance2)
    {
	mComponents[2] = distance2;
    }
    
    
    // Methods for field "speed2"
    public GrossSpeed getSpeed2()
    {
	return (GrossSpeed)mComponents[3];
    }
    
    public void setSpeed2(GrossSpeed speed2)
    {
	mComponents[3] = speed2;
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
	    "SnapshotDistance"
	),
	new QName (
	    "DSRC",
	    "SnapshotDistance"
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
				"GrossDistance"
			    ),
			    new QName (
				"DSRC",
				"GrossDistance"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new GrossDistance(0), 
				    new GrossDistance(1023),
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
		    "distance1",
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
				"GrossDistance"
			    ),
			    new QName (
				"DSRC",
				"GrossDistance"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new GrossDistance(0), 
				    new GrossDistance(1023),
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
		    "distance2",
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
     * Get the type descriptor (TypeInfo) of 'this' SnapshotDistance object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SnapshotDistance object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SnapshotDistance
