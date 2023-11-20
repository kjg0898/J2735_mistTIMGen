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
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type VehicleSafetyExtensions from ASN1 Module DSRC.
 * @see Sequence
 */

public class VehicleSafetyExtensions extends Sequence {
    
    /**
     * The default constructor.
     */
    public VehicleSafetyExtensions()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public VehicleSafetyExtensions(VehicleEventFlags events, 
		    PathHistory pathHistory, PathPrediction pathPrediction, 
		    ExteriorLights lights)
    {
	setEvents(events);
	setPathHistory(pathHistory);
	setPathPrediction(pathPrediction);
	setLights(lights);
    }
    
    public void initComponents()
    {
	mComponents[0] = new VehicleEventFlags();
	mComponents[1] = new PathHistory();
	mComponents[2] = new PathPrediction();
	mComponents[3] = new ExteriorLights();
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
		return new VehicleEventFlags();
	    case 1:
		return new PathHistory();
	    case 2:
		return new PathPrediction();
	    case 3:
		return new ExteriorLights();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "events"
    public VehicleEventFlags getEvents()
    {
	return (VehicleEventFlags)mComponents[0];
    }
    
    public void setEvents(VehicleEventFlags events)
    {
	mComponents[0] = events;
    }
    
    public boolean hasEvents()
    {
	return componentIsPresent(0);
    }
    
    public void deleteEvents()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "pathHistory"
    public PathHistory getPathHistory()
    {
	return (PathHistory)mComponents[1];
    }
    
    public void setPathHistory(PathHistory pathHistory)
    {
	mComponents[1] = pathHistory;
    }
    
    public boolean hasPathHistory()
    {
	return componentIsPresent(1);
    }
    
    public void deletePathHistory()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "pathPrediction"
    public PathPrediction getPathPrediction()
    {
	return (PathPrediction)mComponents[2];
    }
    
    public void setPathPrediction(PathPrediction pathPrediction)
    {
	mComponents[2] = pathPrediction;
    }
    
    public boolean hasPathPrediction()
    {
	return componentIsPresent(2);
    }
    
    public void deletePathPrediction()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "lights"
    public ExteriorLights getLights()
    {
	return (ExteriorLights)mComponents[3];
    }
    
    public void setLights(ExteriorLights lights)
    {
	mComponents[3] = lights;
    }
    
    public boolean hasLights()
    {
	return componentIsPresent(3);
    }
    
    public void deleteLights()
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
	    "VehicleSafetyExtensions"
	),
	new QName (
	    "DSRC",
	    "VehicleSafetyExtensions"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"VehicleEventFlags"
			    ),
			    new QName (
				"DSRC",
				"VehicleEventFlags"
			    ),
			    274454,
			    new SizeConstraint (
				new ExtensibleConstraint (
				    new SingleValueConstraint (
					new INTEGER(13)
				    ),
				    null
				)
			    ),
			    new Bounds (
				Long.valueOf(13),
				Long.valueOf(13)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"eventHazardLights",
					0
				    ),
				    new MemberListElement (
					"eventStopLineViolation",
					1
				    ),
				    new MemberListElement (
					"eventABSactivated",
					2
				    ),
				    new MemberListElement (
					"eventTractionControlLoss",
					3
				    ),
				    new MemberListElement (
					"eventStabilityControlactivated",
					4
				    ),
				    new MemberListElement (
					"eventHazardousMaterials",
					5
				    ),
				    new MemberListElement (
					"eventReserved1",
					6
				    ),
				    new MemberListElement (
					"eventHardBraking",
					7
				    ),
				    new MemberListElement (
					"eventLightsChanged",
					8
				    ),
				    new MemberListElement (
					"eventWipersChanged",
					9
				    ),
				    new MemberListElement (
					"eventFlatTire",
					10
				    ),
				    new MemberListElement (
					"eventDisabledVehicle",
					11
				    ),
				    new MemberListElement (
					"eventAirBagDeployment",
					12
				    )
				}
			    )
			)
		    ),
		    "events",
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
				"dsrc.dsrc",
				"PathHistory"
			    ),
			    new QName (
				"DSRC",
				"PathHistory"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "PathHistory"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "PathHistory"
				)
			    ),
			    0
			)
		    ),
		    "pathHistory",
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
				"PathPrediction"
			    ),
			    new QName (
				"DSRC",
				"PathPrediction"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "PathPrediction"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "PathPrediction"
				)
			    ),
			    0
			)
		    ),
		    "pathPrediction",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"ExteriorLights"
			    ),
			    new QName (
				"DSRC",
				"ExteriorLights"
			    ),
			    274454,
			    new SizeConstraint (
				new ExtensibleConstraint (
				    new SingleValueConstraint (
					new INTEGER(9)
				    ),
				    null
				)
			    ),
			    new Bounds (
				Long.valueOf(9),
				Long.valueOf(9)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"lowBeamHeadlightsOn",
					0
				    ),
				    new MemberListElement (
					"highBeamHeadlightsOn",
					1
				    ),
				    new MemberListElement (
					"leftTurnSignalOn",
					2
				    ),
				    new MemberListElement (
					"rightTurnSignalOn",
					3
				    ),
				    new MemberListElement (
					"hazardSignalOn",
					4
				    ),
				    new MemberListElement (
					"automaticLightControlOn",
					5
				    ),
				    new MemberListElement (
					"daytimeRunningLightsOn",
					6
				    ),
				    new MemberListElement (
					"fogLightOn",
					7
				    ),
				    new MemberListElement (
					"parkingLightsOn",
					8
				    )
				}
			    )
			)
		    ),
		    "lights",
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
     * Get the type descriptor (TypeInfo) of 'this' VehicleSafetyExtensions object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' VehicleSafetyExtensions object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for VehicleSafetyExtensions
