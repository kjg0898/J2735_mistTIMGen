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
 * Define the ASN1 Type IntersectionReferenceID from ASN1 Module DSRC.
 * @see Sequence
 */

public class IntersectionReferenceID extends Sequence {
    
    /**
     * The default constructor.
     */
    public IntersectionReferenceID()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntersectionReferenceID(RoadRegulatorID region, IntersectionID id)
    {
	setRegion(region);
	setId(id);
    }
    
    /**
     * Construct with required components.
     */
    public IntersectionReferenceID(IntersectionID id)
    {
	setId(id);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RoadRegulatorID();
	mComponents[1] = new IntersectionID();
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
		return new RoadRegulatorID();
	    case 1:
		return new IntersectionID();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "region"
    public RoadRegulatorID getRegion()
    {
	return (RoadRegulatorID)mComponents[0];
    }
    
    public void setRegion(RoadRegulatorID region)
    {
	mComponents[0] = region;
    }
    
    public boolean hasRegion()
    {
	return componentIsPresent(0);
    }
    
    public void deleteRegion()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "id"
    public IntersectionID getId()
    {
	return (IntersectionID)mComponents[1];
    }
    
    public void setId(IntersectionID id)
    {
	mComponents[1] = id;
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
	    "IntersectionReferenceID"
	),
	new QName (
	    "DSRC",
	    "IntersectionReferenceID"
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
				"RoadRegulatorID"
			    ),
			    new QName (
				"DSRC",
				"RoadRegulatorID"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new RoadRegulatorID(0), 
				    new RoadRegulatorID(65535),
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
		    "region",
		    0,
		    3,
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
				"IntersectionID"
			    ),
			    new QName (
				"DSRC",
				"IntersectionID"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new IntersectionID(0), 
				    new IntersectionID(65535),
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
		    "id",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' IntersectionReferenceID object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntersectionReferenceID object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntersectionReferenceID
