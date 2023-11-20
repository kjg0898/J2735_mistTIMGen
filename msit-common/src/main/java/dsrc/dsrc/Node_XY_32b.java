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
 * Define the ASN1 Type Node_XY_32b from ASN1 Module DSRC.
 * @see Sequence
 */

public class Node_XY_32b extends Sequence {
    
    /**
     * The default constructor.
     */
    public Node_XY_32b()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Node_XY_32b(Offset_B16 x, Offset_B16 y)
    {
	setX(x);
	setY(y);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Offset_B16();
	mComponents[1] = new Offset_B16();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new Offset_B16();
	    case 1:
		return new Offset_B16();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "x"
    public Offset_B16 getX()
    {
	return (Offset_B16)mComponents[0];
    }
    
    public void setX(Offset_B16 x)
    {
	mComponents[0] = x;
    }
    
    
    // Methods for field "y"
    public Offset_B16 getY()
    {
	return (Offset_B16)mComponents[1];
    }
    
    public void setY(Offset_B16 y)
    {
	mComponents[1] = y;
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
	    "Node_XY_32b"
	),
	new QName (
	    "DSRC",
	    "Node-XY-32b"
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
				"Offset_B16"
			    ),
			    new QName (
				"DSRC",
				"Offset-B16"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Offset_B16(-32768), 
				    new Offset_B16(32767),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-32768),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "x",
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
				"Offset_B16"
			    ),
			    new QName (
				"DSRC",
				"Offset-B16"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Offset_B16(-32768), 
				    new Offset_B16(32767),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-32768),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "y",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Node_XY_32b object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Node_XY_32b object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Node_XY_32b
