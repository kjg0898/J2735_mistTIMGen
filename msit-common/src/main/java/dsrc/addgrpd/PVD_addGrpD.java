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
import com.oss.asn1.SequenceOf;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type PVD_addGrpD from ASN1 Module AddGrpD.
 * @see Sequence
 */

public class PVD_addGrpD extends Sequence {
    
    /**
     * The default constructor.
     */
    public PVD_addGrpD()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PVD_addGrpD(Cits cits)
    {
	setCits(cits);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Cits();
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
		return new Cits();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cits"
    public Cits getCits()
    {
	return (Cits)mComponents[0];
    }
    
    public void setCits(Cits cits)
    {
	mComponents[0] = cits;
    }
    
    public boolean hasCits()
    {
	return componentIsPresent(0);
    }
    
    public void deleteCits()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type Cits from ASN1 Module AddGrpD.
     * @see SequenceOf
     */
    public static class Cits extends SequenceOf<CITSPVD> {
	
	/**
	 * The default constructor.
	 */
	public Cits()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Cits(CITSPVD[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new CITSPVD();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"dsrc.addgrpd",
		"PVD_addGrpD$Cits"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    274450,
	    new SizeConstraint (
		new ValueRangeConstraint (
		    new AbstractBounds(
			new INTEGER(1),
			new INTEGER(32),
			0
		    )
		)
	    ),
	    new Bounds (
		Long.valueOf(1),
		Long.valueOf(32)
	    ),
	    new TypeInfoRef (
		new QName (
		    "dsrc.addgrpd",
		    "CITSPVD"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Cits object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Cits object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Cits

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
	    "PVD_addGrpD"
	),
	new QName (
	    "AddGrpD",
	    "PVD-addGrpD"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.addgrpd",
			    "PVD_addGrpD$Cits"
			)
		    ),
		    "cits",
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
     * Get the type descriptor (TypeInfo) of 'this' PVD_addGrpD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PVD_addGrpD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PVD_addGrpD
