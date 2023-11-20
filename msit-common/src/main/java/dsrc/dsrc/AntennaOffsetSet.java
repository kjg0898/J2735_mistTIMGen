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
 * Define the ASN1 Type AntennaOffsetSet from ASN1 Module DSRC.
 * @see Sequence
 */

public class AntennaOffsetSet extends Sequence {
    
    /**
     * The default constructor.
     */
    public AntennaOffsetSet()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AntennaOffsetSet(Offset_B12 antOffsetX, Offset_B09 antOffsetY, 
		    Offset_B10 antOffsetZ)
    {
	setAntOffsetX(antOffsetX);
	setAntOffsetY(antOffsetY);
	setAntOffsetZ(antOffsetZ);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Offset_B12();
	mComponents[1] = new Offset_B09();
	mComponents[2] = new Offset_B10();
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
		return new Offset_B12();
	    case 1:
		return new Offset_B09();
	    case 2:
		return new Offset_B10();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "antOffsetX"
    public Offset_B12 getAntOffsetX()
    {
	return (Offset_B12)mComponents[0];
    }
    
    public void setAntOffsetX(Offset_B12 antOffsetX)
    {
	mComponents[0] = antOffsetX;
    }
    
    
    // Methods for field "antOffsetY"
    public Offset_B09 getAntOffsetY()
    {
	return (Offset_B09)mComponents[1];
    }
    
    public void setAntOffsetY(Offset_B09 antOffsetY)
    {
	mComponents[1] = antOffsetY;
    }
    
    
    // Methods for field "antOffsetZ"
    public Offset_B10 getAntOffsetZ()
    {
	return (Offset_B10)mComponents[2];
    }
    
    public void setAntOffsetZ(Offset_B10 antOffsetZ)
    {
	mComponents[2] = antOffsetZ;
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
	    "AntennaOffsetSet"
	),
	new QName (
	    "DSRC",
	    "AntennaOffsetSet"
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
		    "antOffsetX",
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
				"Offset_B09"
			    ),
			    new QName (
				"DSRC",
				"Offset-B09"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Offset_B09(-256), 
				    new Offset_B09(255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-256),
				Long.valueOf(255)
			    ),
			    null
			)
		    ),
		    "antOffsetY",
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
				"Offset_B10"
			    ),
			    new QName (
				"DSRC",
				"Offset-B10"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Offset_B10(-512), 
				    new Offset_B10(511),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-512),
				Long.valueOf(511)
			    ),
			    null
			)
		    ),
		    "antOffsetZ",
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
     * Get the type descriptor (TypeInfo) of 'this' AntennaOffsetSet object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AntennaOffsetSet object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AntennaOffsetSet
