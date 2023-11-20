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
 * Define the ASN1 Type Node_LLdms_80b from ASN1 Module AddGrpB.
 * @see Sequence
 */

public class Node_LLdms_80b extends Sequence {
    
    /**
     * The default constructor.
     */
    public Node_LLdms_80b()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Node_LLdms_80b(LongitudeDMS2 lon, LatitudeDMS2 lat)
    {
	setLon(lon);
	setLat(lat);
    }
    
    public void initComponents()
    {
	mComponents[0] = new LongitudeDMS2();
	mComponents[1] = new LatitudeDMS2();
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
		return new LongitudeDMS2();
	    case 1:
		return new LatitudeDMS2();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "lon"
    public LongitudeDMS2 getLon()
    {
	return (LongitudeDMS2)mComponents[0];
    }
    
    public void setLon(LongitudeDMS2 lon)
    {
	mComponents[0] = lon;
    }
    
    
    // Methods for field "lat"
    public LatitudeDMS2 getLat()
    {
	return (LatitudeDMS2)mComponents[1];
    }
    
    public void setLat(LatitudeDMS2 lat)
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
	    "Node_LLdms_80b"
	),
	new QName (
	    "AddGrpB",
	    "Node-LLdms-80b"
	),
	274450,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.addgrpb",
				"LongitudeDMS2"
			    ),
			    new QName (
				"AddGrpB",
				"LongitudeDMS2"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpb",
				    "LongitudeDMS2"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpb",
				    "LongitudeDMS2"
				)
			    ),
			    0
			)
		    ),
		    "lon",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.addgrpb",
				"LatitudeDMS2"
			    ),
			    new QName (
				"AddGrpB",
				"LatitudeDMS2"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpb",
				    "LatitudeDMS2"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpb",
				    "LatitudeDMS2"
				)
			    ),
			    0
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
     * Get the type descriptor (TypeInfo) of 'this' Node_LLdms_80b object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Node_LLdms_80b object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Node_LLdms_80b
