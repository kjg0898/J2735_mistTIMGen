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


package dsrc.addgrpb;

import com.oss.asn1.AbstractData;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type Node_LLdms_48b from ASN1 Module AddGrpB.
 * @see Sequence
 */

public class Node_LLdms_48b extends Sequence {
    
    /**
     * The default constructor.
     */
    public Node_LLdms_48b()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Node_LLdms_48b(LongitudeDMS lon, LatitudeDMS lat)
    {
	setLon(lon);
	setLat(lat);
    }
    
    public void initComponents()
    {
	mComponents[0] = new LongitudeDMS();
	mComponents[1] = new LatitudeDMS();
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
		return new LongitudeDMS();
	    case 1:
		return new LatitudeDMS();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "lon"
    public LongitudeDMS getLon()
    {
	return (LongitudeDMS)mComponents[0];
    }
    
    public void setLon(LongitudeDMS lon)
    {
	mComponents[0] = lon;
    }
    
    
    // Methods for field "lat"
    public LatitudeDMS getLat()
    {
	return (LatitudeDMS)mComponents[1];
    }
    
    public void setLat(LatitudeDMS lat)
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
	    "dsrc.addgrpb",
	    "Node_LLdms_48b"
	),
	new QName (
	    "AddGrpB",
	    "Node-LLdms-48b"
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
				"dsrc.addgrpb",
				"LongitudeDMS"
			    ),
			    new QName (
				"AddGrpB",
				"LongitudeDMS"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new LongitudeDMS(-64800000), 
				    new LongitudeDMS(64800000),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-64800000),
				Long.valueOf(64800000)
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
				"dsrc.addgrpb",
				"LatitudeDMS"
			    ),
			    new QName (
				"AddGrpB",
				"LatitudeDMS"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new LatitudeDMS(-32400000), 
				    new LatitudeDMS(32400000),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-32400000),
				Long.valueOf(32400000)
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
     * Get the type descriptor (TypeInfo) of 'this' Node_LLdms_48b object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Node_LLdms_48b object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Node_LLdms_48b
