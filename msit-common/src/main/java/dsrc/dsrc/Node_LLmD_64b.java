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
 * Define the ASN1 Type Node_LLmD_64b from ASN1 Module DSRC.
 * @see Sequence
 */

public class Node_LLmD_64b extends Sequence {
    
    /**
     * The default constructor.
     */
    public Node_LLmD_64b()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Node_LLmD_64b(Longitude lon, Latitude lat)
    {
	setLon(lon);
	setLat(lat);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Longitude();
	mComponents[1] = new Latitude();
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
		return new Longitude();
	    case 1:
		return new Latitude();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "lon"
    public Longitude getLon()
    {
	return (Longitude)mComponents[0];
    }
    
    public void setLon(Longitude lon)
    {
	mComponents[0] = lon;
    }
    
    
    // Methods for field "lat"
    public Latitude getLat()
    {
	return (Latitude)mComponents[1];
    }
    
    public void setLat(Latitude lat)
    {
	mComponents[1] = lat;
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
	    "Node_LLmD_64b"
	),
	new QName (
	    "DSRC",
	    "Node-LLmD-64b"
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
				"Longitude"
			    ),
			    new QName (
				"DSRC",
				"Longitude"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Longitude(-1799999999), 
				    new Longitude(1800000001),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-1799999999),
				Long.valueOf(1800000001)
			    ),
			    null
			)
		    ),
		    "lon",
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
				"Latitude"
			    ),
			    new QName (
				"DSRC",
				"Latitude"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Latitude(-900000000), 
				    new Latitude(900000001),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-900000000),
				Long.valueOf(900000001)
			    ),
			    null
			)
		    ),
		    "lat",
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
     * Get the type descriptor (TypeInfo) of 'this' Node_LLmD_64b object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Node_LLmD_64b object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Node_LLmD_64b
