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
 * Define the ASN1 Type PositionConfidenceSet from ASN1 Module DSRC.
 * @see Sequence
 */

public class PositionConfidenceSet extends Sequence {
    
    /**
     * The default constructor.
     */
    public PositionConfidenceSet()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PositionConfidenceSet(PositionConfidence pos, 
		    ElevationConfidence elevation)
    {
	setPos(pos);
	setElevation(elevation);
    }
    
    public void initComponents()
    {
	mComponents[0] = PositionConfidence.unavailable;
	mComponents[1] = ElevationConfidence.unavailable;
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
		return PositionConfidence.unavailable;
	    case 1:
		return ElevationConfidence.unavailable;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "pos"
    public PositionConfidence getPos()
    {
	return (PositionConfidence)mComponents[0];
    }
    
    public void setPos(PositionConfidence pos)
    {
	mComponents[0] = pos;
    }
    
    
    // Methods for field "elevation"
    public ElevationConfidence getElevation()
    {
	return (ElevationConfidence)mComponents[1];
    }
    
    public void setElevation(ElevationConfidence elevation)
    {
	mComponents[1] = elevation;
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
	    "PositionConfidenceSet"
	),
	new QName (
	    "DSRC",
	    "PositionConfidenceSet"
	),
	274450,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"PositionConfidence"
			    ),
			    new QName (
				"DSRC",
				"PositionConfidence"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"a500m",
					1
				    ),
				    new MemberListElement (
					"a200m",
					2
				    ),
				    new MemberListElement (
					"a100m",
					3
				    ),
				    new MemberListElement (
					"a50m",
					4
				    ),
				    new MemberListElement (
					"a20m",
					5
				    ),
				    new MemberListElement (
					"a10m",
					6
				    ),
				    new MemberListElement (
					"a5m",
					7
				    ),
				    new MemberListElement (
					"a2m",
					8
				    ),
				    new MemberListElement (
					"a1m",
					9
				    ),
				    new MemberListElement (
					"a50cm",
					10
				    ),
				    new MemberListElement (
					"a20cm",
					11
				    ),
				    new MemberListElement (
					"a10cm",
					12
				    ),
				    new MemberListElement (
					"a5cm",
					13
				    ),
				    new MemberListElement (
					"a2cm",
					14
				    ),
				    new MemberListElement (
					"a1cm",
					15
				    )
				}
			    ),
			    0,
			    PositionConfidence.unavailable
			)
		    ),
		    "pos",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"ElevationConfidence"
			    ),
			    new QName (
				"DSRC",
				"ElevationConfidence"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"elev-500-00",
					1
				    ),
				    new MemberListElement (
					"elev-200-00",
					2
				    ),
				    new MemberListElement (
					"elev-100-00",
					3
				    ),
				    new MemberListElement (
					"elev-050-00",
					4
				    ),
				    new MemberListElement (
					"elev-020-00",
					5
				    ),
				    new MemberListElement (
					"elev-010-00",
					6
				    ),
				    new MemberListElement (
					"elev-005-00",
					7
				    ),
				    new MemberListElement (
					"elev-002-00",
					8
				    ),
				    new MemberListElement (
					"elev-001-00",
					9
				    ),
				    new MemberListElement (
					"elev-000-50",
					10
				    ),
				    new MemberListElement (
					"elev-000-20",
					11
				    ),
				    new MemberListElement (
					"elev-000-10",
					12
				    ),
				    new MemberListElement (
					"elev-000-05",
					13
				    ),
				    new MemberListElement (
					"elev-000-02",
					14
				    ),
				    new MemberListElement (
					"elev-000-01",
					15
				    )
				}
			    ),
			    0,
			    ElevationConfidence.unavailable
			)
		    ),
		    "elevation",
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
     * Get the type descriptor (TypeInfo) of 'this' PositionConfidenceSet object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PositionConfidenceSet object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PositionConfidenceSet
