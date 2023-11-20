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
 * Define the ASN1 Type Snapshot from ASN1 Module DSRC.
 * @see Sequence
 */

public class Snapshot extends Sequence {
    
    /**
     * The default constructor.
     */
    public Snapshot()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Snapshot(FullPositionVector thePosition, 
		    VehicleSafetyExtensions safetyExt, VehicleStatus dataSet)
    {
	setThePosition(thePosition);
	setSafetyExt(safetyExt);
	setDataSet(dataSet);
    }
    
    /**
     * Construct with required components.
     */
    public Snapshot(FullPositionVector thePosition)
    {
	setThePosition(thePosition);
    }
    
    public void initComponents()
    {
	mComponents[0] = new FullPositionVector();
	mComponents[1] = new VehicleSafetyExtensions();
	mComponents[2] = new VehicleStatus();
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
		return new FullPositionVector();
	    case 1:
		return new VehicleSafetyExtensions();
	    case 2:
		return new VehicleStatus();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "thePosition"
    public FullPositionVector getThePosition()
    {
	return (FullPositionVector)mComponents[0];
    }
    
    public void setThePosition(FullPositionVector thePosition)
    {
	mComponents[0] = thePosition;
    }
    
    
    // Methods for field "safetyExt"
    public VehicleSafetyExtensions getSafetyExt()
    {
	return (VehicleSafetyExtensions)mComponents[1];
    }
    
    public void setSafetyExt(VehicleSafetyExtensions safetyExt)
    {
	mComponents[1] = safetyExt;
    }
    
    public boolean hasSafetyExt()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSafetyExt()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "dataSet"
    public VehicleStatus getDataSet()
    {
	return (VehicleStatus)mComponents[2];
    }
    
    public void setDataSet(VehicleStatus dataSet)
    {
	mComponents[2] = dataSet;
    }
    
    public boolean hasDataSet()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDataSet()
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
	    "dsrc.dsrc",
	    "Snapshot"
	),
	new QName (
	    "DSRC",
	    "Snapshot"
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
				"dsrc.dsrc",
				"FullPositionVector"
			    ),
			    new QName (
				"DSRC",
				"FullPositionVector"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "FullPositionVector"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "FullPositionVector"
				)
			    ),
			    0
			)
		    ),
		    "thePosition",
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
				"dsrc.dsrc",
				"VehicleSafetyExtensions"
			    ),
			    new QName (
				"DSRC",
				"VehicleSafetyExtensions"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "VehicleSafetyExtensions"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "VehicleSafetyExtensions"
				)
			    ),
			    0
			)
		    ),
		    "safetyExt",
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
				"dsrc.dsrc",
				"VehicleStatus"
			    ),
			    new QName (
				"DSRC",
				"VehicleStatus"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "VehicleStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "VehicleStatus"
				)
			    ),
			    0
			)
		    ),
		    "dataSet",
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
			new TagDecoderElement((short)0x8000, 0)
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
     * Get the type descriptor (TypeInfo) of 'this' Snapshot object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Snapshot object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Snapshot
