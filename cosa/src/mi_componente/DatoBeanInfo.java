/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi_componente;

import java.beans.*;

/**
 *
 * @author subzero
 */
public class DatoBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( mi_componente.Dato.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
        // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_actionMap = 1;
    private static final int PROPERTY_alignmentX = 2;
    private static final int PROPERTY_alignmentY = 3;
    private static final int PROPERTY_ancestorListeners = 4;
    private static final int PROPERTY_autoscrolls = 5;
    private static final int PROPERTY_background = 6;
    private static final int PROPERTY_backgroundSet = 7;
    private static final int PROPERTY_baselineResizeBehavior = 8;
    private static final int PROPERTY_border = 9;
    private static final int PROPERTY_bounds = 10;
    private static final int PROPERTY_caracter = 11;
    private static final int PROPERTY_colorModel = 12;
    private static final int PROPERTY_component = 13;
    private static final int PROPERTY_componentCount = 14;
    private static final int PROPERTY_componentListeners = 15;
    private static final int PROPERTY_componentOrientation = 16;
    private static final int PROPERTY_componentPopupMenu = 17;
    private static final int PROPERTY_components = 18;
    private static final int PROPERTY_containerListeners = 19;
    private static final int PROPERTY_cursor = 20;
    private static final int PROPERTY_cursorSet = 21;
    private static final int PROPERTY_debugGraphicsOptions = 22;
    private static final int PROPERTY_decimal = 23;
    private static final int PROPERTY_displayable = 24;
    private static final int PROPERTY_doubleBuffered = 25;
    private static final int PROPERTY_dropTarget = 26;
    private static final int PROPERTY_enabled = 27;
    private static final int PROPERTY_etiqueta = 28;
    private static final int PROPERTY_focusable = 29;
    private static final int PROPERTY_focusCycleRoot = 30;
    private static final int PROPERTY_focusCycleRootAncestor = 31;
    private static final int PROPERTY_focusListeners = 32;
    private static final int PROPERTY_focusOwner = 33;
    private static final int PROPERTY_focusTraversable = 34;
    private static final int PROPERTY_focusTraversalKeys = 35;
    private static final int PROPERTY_focusTraversalKeysEnabled = 36;
    private static final int PROPERTY_focusTraversalPolicy = 37;
    private static final int PROPERTY_focusTraversalPolicyProvider = 38;
    private static final int PROPERTY_focusTraversalPolicySet = 39;
    private static final int PROPERTY_font = 40;
    private static final int PROPERTY_fontSet = 41;
    private static final int PROPERTY_foreground = 42;
    private static final int PROPERTY_foregroundSet = 43;
    private static final int PROPERTY_graphics = 44;
    private static final int PROPERTY_graphicsConfiguration = 45;
    private static final int PROPERTY_height = 46;
    private static final int PROPERTY_hierarchyBoundsListeners = 47;
    private static final int PROPERTY_hierarchyListeners = 48;
    private static final int PROPERTY_ignoreRepaint = 49;
    private static final int PROPERTY_inheritsPopupMenu = 50;
    private static final int PROPERTY_inputContext = 51;
    private static final int PROPERTY_inputMap = 52;
    private static final int PROPERTY_inputMethodListeners = 53;
    private static final int PROPERTY_inputMethodRequests = 54;
    private static final int PROPERTY_inputVerifier = 55;
    private static final int PROPERTY_insets = 56;
    private static final int PROPERTY_keyListeners = 57;
    private static final int PROPERTY_layout = 58;
    private static final int PROPERTY_letra = 59;
    private static final int PROPERTY_lightweight = 60;
    private static final int PROPERTY_locale = 61;
    private static final int PROPERTY_location = 62;
    private static final int PROPERTY_locationOnScreen = 63;
    private static final int PROPERTY_managingFocus = 64;
    private static final int PROPERTY_max_punto = 65;
    private static final int PROPERTY_maximo = 66;
    private static final int PROPERTY_maximumSize = 67;
    private static final int PROPERTY_maximumSizeSet = 68;
    private static final int PROPERTY_minimo = 69;
    private static final int PROPERTY_minimumSize = 70;
    private static final int PROPERTY_minimumSizeSet = 71;
    private static final int PROPERTY_mouseListeners = 72;
    private static final int PROPERTY_mouseMotionListeners = 73;
    private static final int PROPERTY_mousePosition = 74;
    private static final int PROPERTY_mouseWheelListeners = 75;
    private static final int PROPERTY_name = 76;
    private static final int PROPERTY_nextFocusableComponent = 77;
    private static final int PROPERTY_numero = 78;
    private static final int PROPERTY_opaque = 79;
    private static final int PROPERTY_optimizedDrawingEnabled = 80;
    private static final int PROPERTY_paintingForPrint = 81;
    private static final int PROPERTY_paintingTile = 82;
    private static final int PROPERTY_parent = 83;
    private static final int PROPERTY_peer = 84;
    private static final int PROPERTY_preferredSize = 85;
    private static final int PROPERTY_preferredSizeSet = 86;
    private static final int PROPERTY_propertyChangeListeners = 87;
    private static final int PROPERTY_registeredKeyStrokes = 88;
    private static final int PROPERTY_requestFocusEnabled = 89;
    private static final int PROPERTY_rootPane = 90;
    private static final int PROPERTY_showing = 91;
    private static final int PROPERTY_size = 92;
    private static final int PROPERTY_texto = 93;
    private static final int PROPERTY_toolkit = 94;
    private static final int PROPERTY_toolTipText = 95;
    private static final int PROPERTY_topLevelAncestor = 96;
    private static final int PROPERTY_transferHandler = 97;
    private static final int PROPERTY_treeLock = 98;
    private static final int PROPERTY_UI = 99;
    private static final int PROPERTY_UIClassID = 100;
    private static final int PROPERTY_valid = 101;
    private static final int PROPERTY_validateRoot = 102;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 103;
    private static final int PROPERTY_vetoableChangeListeners = 104;
    private static final int PROPERTY_visible = 105;
    private static final int PROPERTY_visibleRect = 106;
    private static final int PROPERTY_width = 107;
    private static final int PROPERTY_x = 108;
    private static final int PROPERTY_y = 109;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[110];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", mi_componente.Dato.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", mi_componente.Dato.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", mi_componente.Dato.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", mi_componente.Dato.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", mi_componente.Dato.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", mi_componente.Dato.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", mi_componente.Dato.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", mi_componente.Dato.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", mi_componente.Dato.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", mi_componente.Dato.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", mi_componente.Dato.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_caracter] = new PropertyDescriptor ( "caracter", mi_componente.Dato.class, "isCaracter", "setCaracter" ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", mi_componente.Dato.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", mi_componente.Dato.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", mi_componente.Dato.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", mi_componente.Dato.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", mi_componente.Dato.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", mi_componente.Dato.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", mi_componente.Dato.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", mi_componente.Dato.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", mi_componente.Dato.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", mi_componente.Dato.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", mi_componente.Dato.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_decimal] = new PropertyDescriptor ( "decimal", mi_componente.Dato.class, "isDecimal", "setDecimal" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", mi_componente.Dato.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", mi_componente.Dato.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", mi_componente.Dato.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", mi_componente.Dato.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_etiqueta] = new PropertyDescriptor ( "etiqueta", mi_componente.Dato.class, "getEtiqueta", "setEtiqueta" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", mi_componente.Dato.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", mi_componente.Dato.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", mi_componente.Dato.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", mi_componente.Dato.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", mi_componente.Dato.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", mi_componente.Dato.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", mi_componente.Dato.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", mi_componente.Dato.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", mi_componente.Dato.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", mi_componente.Dato.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", mi_componente.Dato.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", mi_componente.Dato.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", mi_componente.Dato.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", mi_componente.Dato.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", mi_componente.Dato.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", mi_componente.Dato.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", mi_componente.Dato.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", mi_componente.Dato.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", mi_componente.Dato.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", mi_componente.Dato.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", mi_componente.Dato.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", mi_componente.Dato.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", mi_componente.Dato.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", mi_componente.Dato.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", mi_componente.Dato.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", mi_componente.Dato.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", mi_componente.Dato.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", mi_componente.Dato.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", mi_componente.Dato.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", mi_componente.Dato.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_letra] = new PropertyDescriptor ( "letra", mi_componente.Dato.class, "isLetra", "setLetra" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", mi_componente.Dato.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", mi_componente.Dato.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", mi_componente.Dato.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", mi_componente.Dato.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", mi_componente.Dato.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_max_punto] = new PropertyDescriptor ( "max_punto", mi_componente.Dato.class, "getMax_punto", "setMax_punto" ); // NOI18N
            properties[PROPERTY_maximo] = new PropertyDescriptor ( "maximo", mi_componente.Dato.class, "getMaximo", "setMaximo" ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", mi_componente.Dato.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", mi_componente.Dato.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_minimo] = new PropertyDescriptor ( "minimo", mi_componente.Dato.class, "getMinimo", "setMinimo" ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", mi_componente.Dato.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", mi_componente.Dato.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", mi_componente.Dato.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", mi_componente.Dato.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", mi_componente.Dato.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", mi_componente.Dato.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", mi_componente.Dato.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", mi_componente.Dato.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_numero] = new PropertyDescriptor ( "numero", mi_componente.Dato.class, "isNumero", "setNumero" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", mi_componente.Dato.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", mi_componente.Dato.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", mi_componente.Dato.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", mi_componente.Dato.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", mi_componente.Dato.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", mi_componente.Dato.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", mi_componente.Dato.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", mi_componente.Dato.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", mi_componente.Dato.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", mi_componente.Dato.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", mi_componente.Dato.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", mi_componente.Dato.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", mi_componente.Dato.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", mi_componente.Dato.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_texto] = new PropertyDescriptor ( "texto", mi_componente.Dato.class, "getTexto", "setTexto" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", mi_componente.Dato.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", mi_componente.Dato.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", mi_componente.Dato.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", mi_componente.Dato.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", mi_componente.Dato.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", mi_componente.Dato.class, "getUI", "setUI" ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", mi_componente.Dato.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", mi_componente.Dato.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", mi_componente.Dato.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", mi_componente.Dato.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", mi_componente.Dato.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", mi_componente.Dato.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", mi_componente.Dato.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", mi_componente.Dato.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", mi_componente.Dato.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", mi_componente.Dato.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
        // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_ancestorListener = 0;
    private static final int EVENT_componentListener = 1;
    private static final int EVENT_containerListener = 2;
    private static final int EVENT_focusListener = 3;
    private static final int EVENT_hierarchyBoundsListener = 4;
    private static final int EVENT_hierarchyListener = 5;
    private static final int EVENT_inputMethodListener = 6;
    private static final int EVENT_keyListener = 7;
    private static final int EVENT_mouseListener = 8;
    private static final int EVENT_mouseMotionListener = 9;
    private static final int EVENT_mouseWheelListener = 10;
    private static final int EVENT_propertyChangeListener = 11;
    private static final int EVENT_vetoableChangeListener = 12;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[13];
    
        try {
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( mi_componente.Dato.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( mi_componente.Dato.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( mi_componente.Dato.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( mi_componente.Dato.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( mi_componente.Dato.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( mi_componente.Dato.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( mi_componente.Dato.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( mi_componente.Dato.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( mi_componente.Dato.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( mi_componente.Dato.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( mi_componente.Dato.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( mi_componente.Dato.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( mi_componente.Dato.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events
        // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_acabo0 = 0;
    private static final int METHOD_action1 = 1;
    private static final int METHOD_add2 = 2;
    private static final int METHOD_add3 = 3;
    private static final int METHOD_add4 = 4;
    private static final int METHOD_add5 = 5;
    private static final int METHOD_add6 = 6;
    private static final int METHOD_add7 = 7;
    private static final int METHOD_addNotify8 = 8;
    private static final int METHOD_addPropertyChangeListener9 = 9;
    private static final int METHOD_applyComponentOrientation10 = 10;
    private static final int METHOD_areFocusTraversalKeysSet11 = 11;
    private static final int METHOD_bounds12 = 12;
    private static final int METHOD_checkImage13 = 13;
    private static final int METHOD_checkImage14 = 14;
    private static final int METHOD_computeVisibleRect15 = 15;
    private static final int METHOD_contains16 = 16;
    private static final int METHOD_contains17 = 17;
    private static final int METHOD_countComponents18 = 18;
    private static final int METHOD_createImage19 = 19;
    private static final int METHOD_createImage20 = 20;
    private static final int METHOD_createToolTip21 = 21;
    private static final int METHOD_createVolatileImage22 = 22;
    private static final int METHOD_createVolatileImage23 = 23;
    private static final int METHOD_deliverEvent24 = 24;
    private static final int METHOD_disable25 = 25;
    private static final int METHOD_dispatchEvent26 = 26;
    private static final int METHOD_doLayout27 = 27;
    private static final int METHOD_enable28 = 28;
    private static final int METHOD_enable29 = 29;
    private static final int METHOD_enableInputMethods30 = 30;
    private static final int METHOD_findComponentAt31 = 31;
    private static final int METHOD_findComponentAt32 = 32;
    private static final int METHOD_firePropertyChange33 = 33;
    private static final int METHOD_firePropertyChange34 = 34;
    private static final int METHOD_firePropertyChange35 = 35;
    private static final int METHOD_firePropertyChange36 = 36;
    private static final int METHOD_firePropertyChange37 = 37;
    private static final int METHOD_firePropertyChange38 = 38;
    private static final int METHOD_firePropertyChange39 = 39;
    private static final int METHOD_firePropertyChange40 = 40;
    private static final int METHOD_focusGained41 = 41;
    private static final int METHOD_focusLost42 = 42;
    private static final int METHOD_getActionForKeyStroke43 = 43;
    private static final int METHOD_getBaseline44 = 44;
    private static final int METHOD_getBounds45 = 45;
    private static final int METHOD_getClientProperty46 = 46;
    private static final int METHOD_getComponentAt47 = 47;
    private static final int METHOD_getComponentAt48 = 48;
    private static final int METHOD_getComponentZOrder49 = 49;
    private static final int METHOD_getConditionForKeyStroke50 = 50;
    private static final int METHOD_getDecimal51 = 51;
    private static final int METHOD_getDefaultLocale52 = 52;
    private static final int METHOD_getFocusTraversalKeys53 = 53;
    private static final int METHOD_getFontMetrics54 = 54;
    private static final int METHOD_getInsets55 = 55;
    private static final int METHOD_getListeners56 = 56;
    private static final int METHOD_getLocation57 = 57;
    private static final int METHOD_getMousePosition58 = 58;
    private static final int METHOD_getPopupLocation59 = 59;
    private static final int METHOD_getPropertyChangeListeners60 = 60;
    private static final int METHOD_getSize61 = 61;
    private static final int METHOD_getToolTipLocation62 = 62;
    private static final int METHOD_getToolTipText63 = 63;
    private static final int METHOD_gotFocus64 = 64;
    private static final int METHOD_grabFocus65 = 65;
    private static final int METHOD_handleEvent66 = 66;
    private static final int METHOD_hasFocus67 = 67;
    private static final int METHOD_hide68 = 68;
    private static final int METHOD_imageUpdate69 = 69;
    private static final int METHOD_insets70 = 70;
    private static final int METHOD_inside71 = 71;
    private static final int METHOD_invalidate72 = 72;
    private static final int METHOD_isAncestorOf73 = 73;
    private static final int METHOD_isFocusCycleRoot74 = 74;
    private static final int METHOD_isLightweightComponent75 = 75;
    private static final int METHOD_keyDown76 = 76;
    private static final int METHOD_keyPressed77 = 77;
    private static final int METHOD_keyReleased78 = 78;
    private static final int METHOD_keyTyped79 = 79;
    private static final int METHOD_keyUp80 = 80;
    private static final int METHOD_layout81 = 81;
    private static final int METHOD_list82 = 82;
    private static final int METHOD_list83 = 83;
    private static final int METHOD_list84 = 84;
    private static final int METHOD_list85 = 85;
    private static final int METHOD_list86 = 86;
    private static final int METHOD_locate87 = 87;
    private static final int METHOD_location88 = 88;
    private static final int METHOD_lostFocus89 = 89;
    private static final int METHOD_minimumSize90 = 90;
    private static final int METHOD_mouseDown91 = 91;
    private static final int METHOD_mouseDrag92 = 92;
    private static final int METHOD_mouseEnter93 = 93;
    private static final int METHOD_mouseExit94 = 94;
    private static final int METHOD_mouseMove95 = 95;
    private static final int METHOD_mouseUp96 = 96;
    private static final int METHOD_move97 = 97;
    private static final int METHOD_nextFocus98 = 98;
    private static final int METHOD_paint99 = 99;
    private static final int METHOD_paintAll100 = 100;
    private static final int METHOD_paintComponents101 = 101;
    private static final int METHOD_paintImmediately102 = 102;
    private static final int METHOD_paintImmediately103 = 103;
    private static final int METHOD_postEvent104 = 104;
    private static final int METHOD_preferredSize105 = 105;
    private static final int METHOD_prepareImage106 = 106;
    private static final int METHOD_prepareImage107 = 107;
    private static final int METHOD_print108 = 108;
    private static final int METHOD_printAll109 = 109;
    private static final int METHOD_printComponents110 = 110;
    private static final int METHOD_putClientProperty111 = 111;
    private static final int METHOD_registerKeyboardAction112 = 112;
    private static final int METHOD_registerKeyboardAction113 = 113;
    private static final int METHOD_remove114 = 114;
    private static final int METHOD_remove115 = 115;
    private static final int METHOD_remove116 = 116;
    private static final int METHOD_removeAll117 = 117;
    private static final int METHOD_removeNotify118 = 118;
    private static final int METHOD_removePropertyChangeListener119 = 119;
    private static final int METHOD_repaint120 = 120;
    private static final int METHOD_repaint121 = 121;
    private static final int METHOD_repaint122 = 122;
    private static final int METHOD_repaint123 = 123;
    private static final int METHOD_repaint124 = 124;
    private static final int METHOD_requestDefaultFocus125 = 125;
    private static final int METHOD_requestFocus126 = 126;
    private static final int METHOD_requestFocus127 = 127;
    private static final int METHOD_requestFocusInWindow128 = 128;
    private static final int METHOD_resetKeyboardActions129 = 129;
    private static final int METHOD_reshape130 = 130;
    private static final int METHOD_resize131 = 131;
    private static final int METHOD_resize132 = 132;
    private static final int METHOD_revalidate133 = 133;
    private static final int METHOD_scrollRectToVisible134 = 134;
    private static final int METHOD_setBounds135 = 135;
    private static final int METHOD_setComponentZOrder136 = 136;
    private static final int METHOD_setDecimal137 = 137;
    private static final int METHOD_setDefaultLocale138 = 138;
    private static final int METHOD_show139 = 139;
    private static final int METHOD_show140 = 140;
    private static final int METHOD_size141 = 141;
    private static final int METHOD_toString142 = 142;
    private static final int METHOD_transferFocus143 = 143;
    private static final int METHOD_transferFocusBackward144 = 144;
    private static final int METHOD_transferFocusDownCycle145 = 145;
    private static final int METHOD_transferFocusUpCycle146 = 146;
    private static final int METHOD_unregisterKeyboardAction147 = 147;
    private static final int METHOD_update148 = 148;
    private static final int METHOD_updateUI149 = 149;
    private static final int METHOD_validate150 = 150;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[151];
    
        try {
            methods[METHOD_acabo0] = new MethodDescriptor(mi_componente.Dato.class.getMethod("acabo", new Class[] {})); // NOI18N
            methods[METHOD_acabo0].setDisplayName ( "" );
            methods[METHOD_action1] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action1].setDisplayName ( "" );
            methods[METHOD_add2] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add2].setDisplayName ( "" );
            methods[METHOD_add3] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_add3].setDisplayName ( "" );
            methods[METHOD_add4] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.lang.String.class, java.awt.Component.class})); // NOI18N
            methods[METHOD_add4].setDisplayName ( "" );
            methods[METHOD_add5] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_add5].setDisplayName ( "" );
            methods[METHOD_add6] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_add6].setDisplayName ( "" );
            methods[METHOD_add7] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_add7].setDisplayName ( "" );
            methods[METHOD_addNotify8] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify8].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener9] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener9].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation10] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation10].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet11] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet11].setDisplayName ( "" );
            methods[METHOD_bounds12] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds12].setDisplayName ( "" );
            methods[METHOD_checkImage13] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage13].setDisplayName ( "" );
            methods[METHOD_checkImage14] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage14].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect15] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect15].setDisplayName ( "" );
            methods[METHOD_contains16] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains16].setDisplayName ( "" );
            methods[METHOD_contains17] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains17].setDisplayName ( "" );
            methods[METHOD_countComponents18] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents18].setDisplayName ( "" );
            methods[METHOD_createImage19] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage19].setDisplayName ( "" );
            methods[METHOD_createImage20] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage20].setDisplayName ( "" );
            methods[METHOD_createToolTip21] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip21].setDisplayName ( "" );
            methods[METHOD_createVolatileImage22] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage22].setDisplayName ( "" );
            methods[METHOD_createVolatileImage23] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage23].setDisplayName ( "" );
            methods[METHOD_deliverEvent24] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent24].setDisplayName ( "" );
            methods[METHOD_disable25] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable25].setDisplayName ( "" );
            methods[METHOD_dispatchEvent26] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent26].setDisplayName ( "" );
            methods[METHOD_doLayout27] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout27].setDisplayName ( "" );
            methods[METHOD_enable28] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable28].setDisplayName ( "" );
            methods[METHOD_enable29] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable29].setDisplayName ( "" );
            methods[METHOD_enableInputMethods30] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods30].setDisplayName ( "" );
            methods[METHOD_findComponentAt31] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt31].setDisplayName ( "" );
            methods[METHOD_findComponentAt32] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt32].setDisplayName ( "" );
            methods[METHOD_firePropertyChange33] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange33].setDisplayName ( "" );
            methods[METHOD_firePropertyChange34] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange34].setDisplayName ( "" );
            methods[METHOD_firePropertyChange35] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange35].setDisplayName ( "" );
            methods[METHOD_firePropertyChange36] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange36].setDisplayName ( "" );
            methods[METHOD_firePropertyChange37] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange37].setDisplayName ( "" );
            methods[METHOD_firePropertyChange38] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_firePropertyChange38].setDisplayName ( "" );
            methods[METHOD_firePropertyChange39] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_firePropertyChange39].setDisplayName ( "" );
            methods[METHOD_firePropertyChange40] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange40].setDisplayName ( "" );
            methods[METHOD_focusGained41] = new MethodDescriptor(mi_componente.Dato.class.getMethod("focusGained", new Class[] {java.awt.event.FocusEvent.class})); // NOI18N
            methods[METHOD_focusGained41].setDisplayName ( "" );
            methods[METHOD_focusLost42] = new MethodDescriptor(mi_componente.Dato.class.getMethod("focusLost", new Class[] {java.awt.event.FocusEvent.class})); // NOI18N
            methods[METHOD_focusLost42].setDisplayName ( "" );
            methods[METHOD_getActionForKeyStroke43] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getActionForKeyStroke43].setDisplayName ( "" );
            methods[METHOD_getBaseline44] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline44].setDisplayName ( "" );
            methods[METHOD_getBounds45] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds45].setDisplayName ( "" );
            methods[METHOD_getClientProperty46] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty46].setDisplayName ( "" );
            methods[METHOD_getComponentAt47] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt47].setDisplayName ( "" );
            methods[METHOD_getComponentAt48] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt48].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder49] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder49].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke50] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke50].setDisplayName ( "" );
            methods[METHOD_getDecimal51] = new MethodDescriptor(mi_componente.Dato.class.getMethod("getDecimal", new Class[] {})); // NOI18N
            methods[METHOD_getDecimal51].setDisplayName ( "" );
            methods[METHOD_getDefaultLocale52] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLocale52].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys53] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys53].setDisplayName ( "" );
            methods[METHOD_getFontMetrics54] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics54].setDisplayName ( "" );
            methods[METHOD_getInsets55] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets55].setDisplayName ( "" );
            methods[METHOD_getListeners56] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners56].setDisplayName ( "" );
            methods[METHOD_getLocation57] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation57].setDisplayName ( "" );
            methods[METHOD_getMousePosition58] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition58].setDisplayName ( "" );
            methods[METHOD_getPopupLocation59] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation59].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners60] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners60].setDisplayName ( "" );
            methods[METHOD_getSize61] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize61].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation62] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation62].setDisplayName ( "" );
            methods[METHOD_getToolTipText63] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText63].setDisplayName ( "" );
            methods[METHOD_gotFocus64] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus64].setDisplayName ( "" );
            methods[METHOD_grabFocus65] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus65].setDisplayName ( "" );
            methods[METHOD_handleEvent66] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent66].setDisplayName ( "" );
            methods[METHOD_hasFocus67] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus67].setDisplayName ( "" );
            methods[METHOD_hide68] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide68].setDisplayName ( "" );
            methods[METHOD_imageUpdate69] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate69].setDisplayName ( "" );
            methods[METHOD_insets70] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets70].setDisplayName ( "" );
            methods[METHOD_inside71] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside71].setDisplayName ( "" );
            methods[METHOD_invalidate72] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate72].setDisplayName ( "" );
            methods[METHOD_isAncestorOf73] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf73].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot74] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot74].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent75] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent75].setDisplayName ( "" );
            methods[METHOD_keyDown76] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown76].setDisplayName ( "" );
            methods[METHOD_keyPressed77] = new MethodDescriptor(mi_componente.Dato.class.getMethod("keyPressed", new Class[] {java.awt.event.KeyEvent.class})); // NOI18N
            methods[METHOD_keyPressed77].setDisplayName ( "" );
            methods[METHOD_keyReleased78] = new MethodDescriptor(mi_componente.Dato.class.getMethod("keyReleased", new Class[] {java.awt.event.KeyEvent.class})); // NOI18N
            methods[METHOD_keyReleased78].setDisplayName ( "" );
            methods[METHOD_keyTyped79] = new MethodDescriptor(mi_componente.Dato.class.getMethod("keyTyped", new Class[] {java.awt.event.KeyEvent.class})); // NOI18N
            methods[METHOD_keyTyped79].setDisplayName ( "" );
            methods[METHOD_keyUp80] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp80].setDisplayName ( "" );
            methods[METHOD_layout81] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout81].setDisplayName ( "" );
            methods[METHOD_list82] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list82].setDisplayName ( "" );
            methods[METHOD_list83] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list83].setDisplayName ( "" );
            methods[METHOD_list84] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list84].setDisplayName ( "" );
            methods[METHOD_list85] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list85].setDisplayName ( "" );
            methods[METHOD_list86] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list86].setDisplayName ( "" );
            methods[METHOD_locate87] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate87].setDisplayName ( "" );
            methods[METHOD_location88] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location88].setDisplayName ( "" );
            methods[METHOD_lostFocus89] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus89].setDisplayName ( "" );
            methods[METHOD_minimumSize90] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize90].setDisplayName ( "" );
            methods[METHOD_mouseDown91] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown91].setDisplayName ( "" );
            methods[METHOD_mouseDrag92] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag92].setDisplayName ( "" );
            methods[METHOD_mouseEnter93] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter93].setDisplayName ( "" );
            methods[METHOD_mouseExit94] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit94].setDisplayName ( "" );
            methods[METHOD_mouseMove95] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove95].setDisplayName ( "" );
            methods[METHOD_mouseUp96] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp96].setDisplayName ( "" );
            methods[METHOD_move97] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move97].setDisplayName ( "" );
            methods[METHOD_nextFocus98] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus98].setDisplayName ( "" );
            methods[METHOD_paint99] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint99].setDisplayName ( "" );
            methods[METHOD_paintAll100] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll100].setDisplayName ( "" );
            methods[METHOD_paintComponents101] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents101].setDisplayName ( "" );
            methods[METHOD_paintImmediately102] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately102].setDisplayName ( "" );
            methods[METHOD_paintImmediately103] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately103].setDisplayName ( "" );
            methods[METHOD_postEvent104] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent104].setDisplayName ( "" );
            methods[METHOD_preferredSize105] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize105].setDisplayName ( "" );
            methods[METHOD_prepareImage106] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage106].setDisplayName ( "" );
            methods[METHOD_prepareImage107] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage107].setDisplayName ( "" );
            methods[METHOD_print108] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print108].setDisplayName ( "" );
            methods[METHOD_printAll109] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll109].setDisplayName ( "" );
            methods[METHOD_printComponents110] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents110].setDisplayName ( "" );
            methods[METHOD_putClientProperty111] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty111].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction112] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction112].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction113] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction113].setDisplayName ( "" );
            methods[METHOD_remove114] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove114].setDisplayName ( "" );
            methods[METHOD_remove115] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove115].setDisplayName ( "" );
            methods[METHOD_remove116] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove116].setDisplayName ( "" );
            methods[METHOD_removeAll117] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll117].setDisplayName ( "" );
            methods[METHOD_removeNotify118] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify118].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener119] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener119].setDisplayName ( "" );
            methods[METHOD_repaint120] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint120].setDisplayName ( "" );
            methods[METHOD_repaint121] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint121].setDisplayName ( "" );
            methods[METHOD_repaint122] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint122].setDisplayName ( "" );
            methods[METHOD_repaint123] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint123].setDisplayName ( "" );
            methods[METHOD_repaint124] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint124].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus125] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus125].setDisplayName ( "" );
            methods[METHOD_requestFocus126] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus126].setDisplayName ( "" );
            methods[METHOD_requestFocus127] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus127].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow128] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow128].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions129] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions129].setDisplayName ( "" );
            methods[METHOD_reshape130] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape130].setDisplayName ( "" );
            methods[METHOD_resize131] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize131].setDisplayName ( "" );
            methods[METHOD_resize132] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize132].setDisplayName ( "" );
            methods[METHOD_revalidate133] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate133].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible134] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible134].setDisplayName ( "" );
            methods[METHOD_setBounds135] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds135].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder136] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder136].setDisplayName ( "" );
            methods[METHOD_setDecimal137] = new MethodDescriptor(mi_componente.Dato.class.getMethod("setDecimal", new Class[] {double.class})); // NOI18N
            methods[METHOD_setDecimal137].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale138] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale138].setDisplayName ( "" );
            methods[METHOD_show139] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show139].setDisplayName ( "" );
            methods[METHOD_show140] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show140].setDisplayName ( "" );
            methods[METHOD_size141] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size141].setDisplayName ( "" );
            methods[METHOD_toString142] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString142].setDisplayName ( "" );
            methods[METHOD_transferFocus143] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus143].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward144] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward144].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle145] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle145].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle146] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle146].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction147] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction147].setDisplayName ( "" );
            methods[METHOD_update148] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update148].setDisplayName ( "" );
            methods[METHOD_updateUI149] = new MethodDescriptor(javax.swing.JPanel.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI149].setDisplayName ( "" );
            methods[METHOD_validate150] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate150].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods
        // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = null;//GEN-BEGIN:Icons
    private static String iconNameC32 = null;
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;//GEN-END:Icons

    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx


//GEN-FIRST:Superclass
    // Here you can add code for customizing the Superclass BeanInfo.

//GEN-LAST:Superclass
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable properties of this bean.
     * May return null if the information should be obtained by automatic
     * analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean. May return null if the information
     * should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will belong
     * to the IndexedPropertyDescriptor subclass of PropertyDescriptor. A client
     * of getPropertyDescriptors can use "instanceof" to check if a given
     * PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     *
     * @return An array of EventSetDescriptors describing the kinds of events
     * fired by this bean. May return null if the information should be obtained
     * by automatic analysis.
     */
    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     *
     * @return An array of MethodDescriptors describing the methods implemented
     * by this bean. May return null if the information should be obtained by
     * automatic analysis.
     */
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     *
     * @return Index of default property in the PropertyDescriptor array
     * returned by getPropertyDescriptors.
     * <P>
     * Returns -1 if there is no default property.
     */
    @Override
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will mostly
     * commonly be used by human's when using the bean.
     *
     * @return Index of default event in the EventSetDescriptor array returned
     * by getEventSetDescriptors.
     * <P>
     * Returns -1 if there is no default event.
     */
    @Override
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to represent the
     * bean in toolboxes, toolbars, etc. Icon images will typically be GIFs, but
     * may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from this
     * method.
     * <p>
     * There are four possible flavors of icons (16x16 color, 32x32 color, 16x16
     * mono, 32x32 mono). If a bean choses to only support a single icon we
     * recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background so they can be
     * rendered onto an existing background.
     *
     * @param iconKind The kind of icon requested. This should be one of the
     * constant values ICON_COLOR_16x16, ICON_COLOR_32x32, ICON_MONO_16x16, or
     * ICON_MONO_32x32.
     * @return An image object representing the requested icon. May return null
     * if no suitable icon is available.
     */
    @Override
    public java.awt.Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
                if (iconNameC16 == null) {
                    return null;
                } else {
                    if (iconColor16 == null) {
                        iconColor16 = loadImage(iconNameC16);
                    }
                    return iconColor16;
                }
            case ICON_COLOR_32x32:
                if (iconNameC32 == null) {
                    return null;
                } else {
                    if (iconColor32 == null) {
                        iconColor32 = loadImage(iconNameC32);
                    }
                    return iconColor32;
                }
            case ICON_MONO_16x16:
                if (iconNameM16 == null) {
                    return null;
                } else {
                    if (iconMono16 == null) {
                        iconMono16 = loadImage(iconNameM16);
                    }
                    return iconMono16;
                }
            case ICON_MONO_32x32:
                if (iconNameM32 == null) {
                    return null;
                } else {
                    if (iconMono32 == null) {
                        iconMono32 = loadImage(iconNameM32);
                    }
                    return iconMono32;
                }
            default:
                return null;
        }
    }
    
}
