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


package dsrc.addgrpd;

import com.oss.asn1.AbstractData;
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type CITSTolgateLane from ASN1 Module AddGrpD.
 * @see Sequence
 */

public class CITSTolgateLane extends Sequence {
    
    /**
     * The default constructor.
     */
    public CITSTolgateLane()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CITSTolgateLane(INTEGER laneno, CITSTolgateType type, 
		    INTEGER visible)
    {
	setLaneno(laneno);
	setType(type);
	setVisible(visible);
    }
    
    /**
     * Construct with components.
     */
    public CITSTolgateLane(long laneno, CITSTolgateType type, long visible)
    {
	this(new INTEGER(laneno), type, new INTEGER(visible));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = CITSTolgateType.general;
	mComponents[2] = new INTEGER();
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
		return new INTEGER();
	    case 1:
		return CITSTolgateType.general;
	    case 2:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "laneno"
    public long getLaneno()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setLaneno(long laneno)
    {
	setLaneno(new INTEGER(laneno));
    }
    
    public void setLaneno(INTEGER laneno)
    {
	mComponents[0] = laneno;
    }
    
    
    // Methods for field "type"
    public CITSTolgateType getType()
    {
	return (CITSTolgateType)mComponents[1];
    }
    
    public void setType(CITSTolgateType type)
    {
	mComponents[1] = type;
    }
    
    
    // Methods for field "visible"
    public long getVisible()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setVisible(long visible)
    {
	setVisible(new INTEGER(visible));
    }
    
    public void setVisible(INTEGER visible)
    {
	mComponents[2] = visible;
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
	    "dsrc.addgrpd",
	    "CITSTolgateLane"
	),
	new QName (
	    "AddGrpD",
	    "CITSTolgateLane"
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(1),
				    new INTEGER(32),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(32)
			    ),
			    null
			)
		    ),
		    "laneno",
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
				"dsrc.addgrpd",
				"CITSTolgateType"
			    ),
			    new QName (
				"AddGrpD",
				"CITSTolgateType"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"general",
					1
				    ),
				    new MemberListElement (
					"hipass",
					2
				    ),
				    new MemberListElement (
					"truck-hipass",
					3
				    ),
				    new MemberListElement (
					"multi-hipass-2",
					4
				    ),
				    new MemberListElement (
					"multi-hipass-3",
					5
				    ),
				    new MemberListElement (
					"multi-hipass-4",
					6
				    ),
				    new MemberListElement (
					"multi-hipass-5",
					7
				    )
				}
			    ),
			    0,
			    CITSTolgateType.general
			)
		    ),
		    "type",
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(1),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(1)
			    ),
			    null
			)
		    ),
		    "visible",
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
     * Get the type descriptor (TypeInfo) of 'this' CITSTolgateLane object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CITSTolgateLane object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CITSTolgateLane
