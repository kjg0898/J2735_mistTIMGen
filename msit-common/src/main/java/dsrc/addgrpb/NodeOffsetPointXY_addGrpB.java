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
import com.oss.asn1.Choice;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type NodeOffsetPointXY_addGrpB from ASN1 Module AddGrpB.
 * @see Choice
 */

public class NodeOffsetPointXY_addGrpB extends Choice {
    
    /**
     * The default constructor.
     */
    public NodeOffsetPointXY_addGrpB()
    {
    }
    
    public static final  int  posA_chosen = 1;
    public static final  int  posB_chosen = 2;
    
    // Methods for field "posA"
    public static NodeOffsetPointXY_addGrpB createNodeOffsetPointXY_addGrpBWithPosA(Node_LLdms_48b posA)
    {
	NodeOffsetPointXY_addGrpB __object = new NodeOffsetPointXY_addGrpB();

	__object.setPosA(posA);
	return __object;
    }
    
    public boolean hasPosA()
    {
	return getChosenFlag() == posA_chosen;
    }
    
    public Node_LLdms_48b getPosA()
    {
	if (hasPosA())
	    return (Node_LLdms_48b)mChosenValue;
	else
	    return null;
    }
    
    public void setPosA(Node_LLdms_48b posA)
    {
	setChosenValue(posA);
	setChosenFlag(posA_chosen);
    }
    
    
    // Methods for field "posB"
    public static NodeOffsetPointXY_addGrpB createNodeOffsetPointXY_addGrpBWithPosB(Node_LLdms_80b posB)
    {
	NodeOffsetPointXY_addGrpB __object = new NodeOffsetPointXY_addGrpB();

	__object.setPosB(posB);
	return __object;
    }
    
    public boolean hasPosB()
    {
	return getChosenFlag() == posB_chosen;
    }
    
    public Node_LLdms_80b getPosB()
    {
	if (hasPosB())
	    return (Node_LLdms_80b)mChosenValue;
	else
	    return null;
    }
    
    public void setPosB(Node_LLdms_80b posB)
    {
	setChosenValue(posB);
	setChosenFlag(posB_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case posA_chosen:
		return new Node_LLdms_48b();
	    case posB_chosen:
		return new Node_LLdms_80b();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "dsrc.addgrpb",
	    "NodeOffsetPointXY_addGrpB"
	),
	new QName (
	    "AddGrpB",
	    "NodeOffsetPointXY-addGrpB"
	),
	274454,
	null,
	new FieldsDict (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpb",
				    "Node_LLdms_48b"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpb",
				    "Node_LLdms_48b"
				)
			    ),
			    0
			)
		    ),
		    "posA",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpb",
				    "Node_LLdms_80b"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpb",
				    "Node_LLdms_80b"
				)
			    ),
			    0
			)
		    ),
		    "posB",
		    1,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' NodeOffsetPointXY_addGrpB object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NodeOffsetPointXY_addGrpB object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Check the current selection on unknown extension
     */
    public final boolean hasUnknownExtension()
    {
	return getChosenFlag() > 2;
    }
    
} // End class definition for NodeOffsetPointXY_addGrpB
