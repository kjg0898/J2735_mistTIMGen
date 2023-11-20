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
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type IntersectionState_addGrpC from ASN1 Module AddGrpC.
 * @see Sequence
 */

public class IntersectionState_addGrpC extends Sequence {
    
    /**
     * The default constructor.
     */
    public IntersectionState_addGrpC()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntersectionState_addGrpC(PrioritizationResponseList activePrioritizations)
    {
	setActivePrioritizations(activePrioritizations);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PrioritizationResponseList();
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
		return new PrioritizationResponseList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "activePrioritizations"
    public PrioritizationResponseList getActivePrioritizations()
    {
	return (PrioritizationResponseList)mComponents[0];
    }
    
    public void setActivePrioritizations(PrioritizationResponseList activePrioritizations)
    {
	mComponents[0] = activePrioritizations;
    }
    
    public boolean hasActivePrioritizations()
    {
	return componentIsPresent(0);
    }
    
    public void deleteActivePrioritizations()
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
	    "IntersectionState_addGrpC"
	),
	new QName (
	    "AddGrpC",
	    "IntersectionState-addGrpC"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.addgrpc",
				"PrioritizationResponseList"
			    ),
			    new QName (
				"AddGrpC",
				"PrioritizationResponseList"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(10),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(10)
			    ),
			    new TypeInfoRef (
				new QName (
				    "dsrc.addgrpc",
				    "PrioritizationResponse"
				)
			    )
			)
		    ),
		    "activePrioritizations",
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
     * Get the type descriptor (TypeInfo) of 'this' IntersectionState_addGrpC object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntersectionState_addGrpC object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntersectionState_addGrpC
