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
import com.oss.asn1.IA5String;
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type DataParameters from ASN1 Module DSRC.
 * @see Sequence
 */

public class DataParameters extends Sequence {
    
    /**
     * The default constructor.
     */
    public DataParameters()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DataParameters(IA5String processMethod, IA5String processAgency, 
		    IA5String lastCheckedDate, IA5String geoidUsed)
    {
	setProcessMethod(processMethod);
	setProcessAgency(processAgency);
	setLastCheckedDate(lastCheckedDate);
	setGeoidUsed(geoidUsed);
    }
    
    public void initComponents()
    {
	mComponents[0] = new IA5String();
	mComponents[1] = new IA5String();
	mComponents[2] = new IA5String();
	mComponents[3] = new IA5String();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new IA5String();
	    case 1:
		return new IA5String();
	    case 2:
		return new IA5String();
	    case 3:
		return new IA5String();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "processMethod"
    public IA5String getProcessMethod()
    {
	return (IA5String)mComponents[0];
    }
    
    public void setProcessMethod(IA5String processMethod)
    {
	mComponents[0] = processMethod;
    }
    
    public boolean hasProcessMethod()
    {
	return componentIsPresent(0);
    }
    
    public void deleteProcessMethod()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "processAgency"
    public IA5String getProcessAgency()
    {
	return (IA5String)mComponents[1];
    }
    
    public void setProcessAgency(IA5String processAgency)
    {
	mComponents[1] = processAgency;
    }
    
    public boolean hasProcessAgency()
    {
	return componentIsPresent(1);
    }
    
    public void deleteProcessAgency()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "lastCheckedDate"
    public IA5String getLastCheckedDate()
    {
	return (IA5String)mComponents[2];
    }
    
    public void setLastCheckedDate(IA5String lastCheckedDate)
    {
	mComponents[2] = lastCheckedDate;
    }
    
    public boolean hasLastCheckedDate()
    {
	return componentIsPresent(2);
    }
    
    public void deleteLastCheckedDate()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "geoidUsed"
    public IA5String getGeoidUsed()
    {
	return (IA5String)mComponents[3];
    }
    
    public void setGeoidUsed(IA5String geoidUsed)
    {
	mComponents[3] = geoidUsed;
    }
    
    public boolean hasGeoidUsed()
    {
	return componentIsPresent(3);
    }
    
    public void deleteGeoidUsed()
    {
	setComponentAbsent(3);
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
	    "DataParameters"
	),
	new QName (
	    "DSRC",
	    "DataParameters"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"IA5String"
			    ),
			    new QName (
				"builtin",
				"IA5String"
			    ),
			    274450,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(255),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    IA5StringPAInfo.pa
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(255)
			    ),
			    IA5StringPAInfo.paInfo
			)
		    ),
		    "processMethod",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"IA5String"
			    ),
			    new QName (
				"builtin",
				"IA5String"
			    ),
			    274450,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(255),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    IA5StringPAInfo.pa
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(255)
			    ),
			    IA5StringPAInfo.paInfo
			)
		    ),
		    "processAgency",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"IA5String"
			    ),
			    new QName (
				"builtin",
				"IA5String"
			    ),
			    274450,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(255),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    IA5StringPAInfo.pa
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(255)
			    ),
			    IA5StringPAInfo.paInfo
			)
		    ),
		    "lastCheckedDate",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"IA5String"
			    ),
			    new QName (
				"builtin",
				"IA5String"
			    ),
			    274450,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(255),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    IA5StringPAInfo.pa
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(255)
			    ),
			    IA5StringPAInfo.paInfo
			)
		    ),
		    "geoidUsed",
		    3,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DataParameters object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DataParameters object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DataParameters
