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


package dsrc.addgrpc;

import com.oss.asn1.AbstractData;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type RestrictionUserType_addGrpC from ASN1 Module AddGrpC.
 * @see Sequence
 */

public class RestrictionUserType_addGrpC extends Sequence {
    
    /**
     * The default constructor.
     */
    public RestrictionUserType_addGrpC()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RestrictionUserType_addGrpC(EmissionType emission)
    {
	setEmission(emission);
    }
    
    public void initComponents()
    {
	mComponents[0] = EmissionType.typeA;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return EmissionType.typeA;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "emission"
    public EmissionType getEmission()
    {
	return (EmissionType)mComponents[0];
    }
    
    public void setEmission(EmissionType emission)
    {
	mComponents[0] = emission;
    }
    
    public boolean hasEmission()
    {
	return componentIsPresent(0);
    }
    
    public void deleteEmission()
    {
	setComponentAbsent(0);
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
	    "dsrc.addgrpc",
	    "RestrictionUserType_addGrpC"
	),
	new QName (
	    "AddGrpC",
	    "RestrictionUserType-addGrpC"
	),
	274454,
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
				"dsrc.addgrpc",
				"EmissionType"
			    ),
			    new QName (
				"AddGrpC",
				"EmissionType"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"typeA",
					0
				    ),
				    new MemberListElement (
					"typeB",
					1
				    ),
				    new MemberListElement (
					"typeC",
					2
				    ),
				    new MemberListElement (
					"typeD",
					3
				    ),
				    new MemberListElement (
					"typeE",
					4
				    )
				}
			    ),
			    0,
			    EmissionType.typeA
			)
		    ),
		    "emission",
		    0,
		    3,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RestrictionUserType_addGrpC object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RestrictionUserType_addGrpC object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RestrictionUserType_addGrpC
