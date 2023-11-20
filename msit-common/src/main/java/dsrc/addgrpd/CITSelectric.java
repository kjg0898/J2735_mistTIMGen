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
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type CITSelectric from ASN1 Module AddGrpD.
 * @see Sequence
 */

public class CITSelectric extends Sequence {
    
    /**
     * The default constructor.
     */
    public CITSelectric()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CITSelectric(CITSStationDetail normal, CITSStationDetail quick, 
		    CITSStationDetail _super)
    {
	setNormal(normal);
	setQuick(quick);
	set_super(_super);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CITSStationDetail();
	mComponents[1] = new CITSStationDetail();
	mComponents[2] = new CITSStationDetail();
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
		return new CITSStationDetail();
	    case 1:
		return new CITSStationDetail();
	    case 2:
		return new CITSStationDetail();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "normal"
    public CITSStationDetail getNormal()
    {
	return (CITSStationDetail)mComponents[0];
    }
    
    public void setNormal(CITSStationDetail normal)
    {
	mComponents[0] = normal;
    }
    
    public boolean hasNormal()
    {
	return componentIsPresent(0);
    }
    
    public void deleteNormal()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "quick"
    public CITSStationDetail getQuick()
    {
	return (CITSStationDetail)mComponents[1];
    }
    
    public void setQuick(CITSStationDetail quick)
    {
	mComponents[1] = quick;
    }
    
    public boolean hasQuick()
    {
	return componentIsPresent(1);
    }
    
    public void deleteQuick()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "_super"
    public CITSStationDetail get_super()
    {
	return (CITSStationDetail)mComponents[2];
    }
    
    public void set_super(CITSStationDetail _super)
    {
	mComponents[2] = _super;
    }
    
    public boolean has_super()
    {
	return componentIsPresent(2);
    }
    
    public void delete_super()
    {
	setComponentAbsent(2);
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
	    "CITSelectric"
	),
	new QName (
	    "AddGrpD",
	    "CITSelectric"
	),
	274454,
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
				"dsrc.addgrpd",
				"CITSStationDetail"
			    ),
			    new QName (
				"AddGrpD",
				"CITSStationDetail"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSStationDetail"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSStationDetail"
				)
			    ),
			    0
			)
		    ),
		    "normal",
		    0,
		    3,
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
				"dsrc.addgrpd",
				"CITSStationDetail"
			    ),
			    new QName (
				"AddGrpD",
				"CITSStationDetail"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSStationDetail"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSStationDetail"
				)
			    ),
			    0
			)
		    ),
		    "quick",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.addgrpd",
				"CITSStationDetail"
			    ),
			    new QName (
				"AddGrpD",
				"CITSStationDetail"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSStationDetail"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpd",
				    "CITSStationDetail"
				)
			    ),
			    0
			)
		    ),
		    "super",
		    2,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' CITSelectric object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CITSelectric object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CITSelectric
