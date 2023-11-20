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
 * Define the ASN1 Type VehicleSize from ASN1 Module DSRC.
 * @see Sequence
 */

public class VehicleSize extends Sequence {
    
    /**
     * The default constructor.
     */
    public VehicleSize()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public VehicleSize(VehicleWidth width, VehicleLength length)
    {
	setWidth(width);
	setLength(length);
    }
    
    public void initComponents()
    {
	mComponents[0] = new VehicleWidth();
	mComponents[1] = new VehicleLength();
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
		return new VehicleWidth();
	    case 1:
		return new VehicleLength();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "width"
    public VehicleWidth getWidth()
    {
	return (VehicleWidth)mComponents[0];
    }
    
    public void setWidth(VehicleWidth width)
    {
	mComponents[0] = width;
    }
    
    
    // Methods for field "length"
    public VehicleLength getLength()
    {
	return (VehicleLength)mComponents[1];
    }
    
    public void setLength(VehicleLength length)
    {
	mComponents[1] = length;
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
	    "VehicleSize"
	),
	new QName (
	    "DSRC",
	    "VehicleSize"
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
     * Get the type descriptor (TypeInfo) of 'this' VehicleSize object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' VehicleSize object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for VehicleSize
