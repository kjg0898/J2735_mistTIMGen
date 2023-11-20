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
 * Define the ASN1 Type PositionalAccuracy from ASN1 Module DSRC.
 * @see Sequence
 */

public class PositionalAccuracy extends Sequence {
    
    /**
     * The default constructor.
     */
    public PositionalAccuracy()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PositionalAccuracy(SemiMajorAxisAccuracy semiMajor, 
		    SemiMinorAxisAccuracy semiMinor, 
		    SemiMajorAxisOrientation orientation)
    {
	setSemiMajor(semiMajor);
	setSemiMinor(semiMinor);
	setOrientation(orientation);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SemiMajorAxisAccuracy();
	mComponents[1] = new SemiMinorAxisAccuracy();
	mComponents[2] = new SemiMajorAxisOrientation();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new SemiMajorAxisAccuracy();
	    case 1:
		return new SemiMinorAxisAccuracy();
	    case 2:
		return new SemiMajorAxisOrientation();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "semiMajor"
    public SemiMajorAxisAccuracy getSemiMajor()
    {
	return (SemiMajorAxisAccuracy)mComponents[0];
    }
    
    public void setSemiMajor(SemiMajorAxisAccuracy semiMajor)
    {
	mComponents[0] = semiMajor;
    }
    
    
    // Methods for field "semiMinor"
    public SemiMinorAxisAccuracy getSemiMinor()
    {
	return (SemiMinorAxisAccuracy)mComponents[1];
    }
    
    public void setSemiMinor(SemiMinorAxisAccuracy semiMinor)
    {
	mComponents[1] = semiMinor;
    }
    
    
    // Methods for field "orientation"
    public SemiMajorAxisOrientation getOrientation()
    {
	return (SemiMajorAxisOrientation)mComponents[2];
    }
    
    public void setOrientation(SemiMajorAxisOrientation orientation)
    {
	mComponents[2] = orientation;
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
	    "PositionalAccuracy"
	),
	new QName (
	    "DSRC",
	    "PositionalAccuracy"
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
				"SemiMajorAxisAccuracy"
			    ),
			    new QName (
				"DSRC",
				"SemiMajorAxisAccuracy"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SemiMajorAxisAccuracy(0), 
				    new SemiMajorAxisAccuracy(255),
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
		    "semiMajor",
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
				"SemiMinorAxisAccuracy"
			    ),
			    new QName (
				"DSRC",
				"SemiMinorAxisAccuracy"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SemiMinorAxisAccuracy(0), 
				    new SemiMinorAxisAccuracy(255),
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
		    "semiMinor",
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
				"SemiMajorAxisOrientation"
			    ),
			    new QName (
				"DSRC",
				"SemiMajorAxisOrientation"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SemiMajorAxisOrientation(0), 
				    new SemiMajorAxisOrientation(65535),
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
		    "orientation",
		    2,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PositionalAccuracy object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PositionalAccuracy object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PositionalAccuracy
