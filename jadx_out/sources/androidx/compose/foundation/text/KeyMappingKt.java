package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.i0;
import kotlin.jvm.internal.g1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"defaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "shortcutModifier", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KeyMappingKt {

    @l
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping commonKeyMapping = commonKeyMapping(new g1() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.g1, kotlin.reflect.q
            @m
            public Object get(@m Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m4740isCtrlPressedZmokQxo(((KeyEvent) obj).m4725unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            @m
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo851mapZmokQxo(@l android.view.KeyEvent keyEvent) {
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m4742isShiftPressedZmokQxo(keyEvent) && KeyEvent_androidKt.m4740isCtrlPressedZmokQxo(keyEvent)) {
                    long m4736getKeyZmokQxo = KeyEvent_androidKt.m4736getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m4428equalsimpl0(m4736getKeyZmokQxo, mappedKeys.m873getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m4428equalsimpl0(m4736getKeyZmokQxo, mappedKeys.m874getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m4428equalsimpl0(m4736getKeyZmokQxo, mappedKeys.m875getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m4428equalsimpl0(m4736getKeyZmokQxo, mappedKeys.m872getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m4740isCtrlPressedZmokQxo(keyEvent)) {
                    long m4736getKeyZmokQxo2 = KeyEvent_androidKt.m4736getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m4428equalsimpl0(m4736getKeyZmokQxo2, mappedKeys2.m873getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m4428equalsimpl0(m4736getKeyZmokQxo2, mappedKeys2.m874getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m4428equalsimpl0(m4736getKeyZmokQxo2, mappedKeys2.m875getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m4428equalsimpl0(m4736getKeyZmokQxo2, mappedKeys2.m872getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m4428equalsimpl0(m4736getKeyZmokQxo2, mappedKeys2.m877getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m4428equalsimpl0(m4736getKeyZmokQxo2, mappedKeys2.m871getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m4428equalsimpl0(m4736getKeyZmokQxo2, mappedKeys2.m867getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m4428equalsimpl0(m4736getKeyZmokQxo2, mappedKeys2.m866getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m4742isShiftPressedZmokQxo(keyEvent)) {
                    long m4736getKeyZmokQxo3 = KeyEvent_androidKt.m4736getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m4428equalsimpl0(m4736getKeyZmokQxo3, mappedKeys3.m880getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_LEFT;
                    } else if (Key.m4428equalsimpl0(m4736getKeyZmokQxo3, mappedKeys3.m879getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                    }
                } else if (KeyEvent_androidKt.m4739isAltPressedZmokQxo(keyEvent)) {
                    long m4736getKeyZmokQxo4 = KeyEvent_androidKt.m4736getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys4 = MappedKeys.INSTANCE;
                    if (Key.m4428equalsimpl0(m4736getKeyZmokQxo4, mappedKeys4.m867getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m4428equalsimpl0(m4736getKeyZmokQxo4, mappedKeys4.m871getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                if (keyCommand == null) {
                    return KeyMapping.this.mo851mapZmokQxo(keyEvent);
                }
                return keyCommand;
            }
        };
    }

    @l
    public static final KeyMapping commonKeyMapping(@l final v3.l<? super KeyEvent, Boolean> lVar) {
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$commonKeyMapping$1
            @Override // androidx.compose.foundation.text.KeyMapping
            @m
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo851mapZmokQxo(@l android.view.KeyEvent keyEvent) {
                boolean m4428equalsimpl0;
                if (lVar.invoke(KeyEvent.m4719boximpl(keyEvent)).booleanValue() && KeyEvent_androidKt.m4742isShiftPressedZmokQxo(keyEvent)) {
                    if (!Key.m4428equalsimpl0(KeyEvent_androidKt.m4736getKeyZmokQxo(keyEvent), MappedKeys.INSTANCE.m888getZEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.REDO;
                }
                if (lVar.invoke(KeyEvent.m4719boximpl(keyEvent)).booleanValue()) {
                    long m4736getKeyZmokQxo = KeyEvent_androidKt.m4736getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m4428equalsimpl0(m4736getKeyZmokQxo, mappedKeys.m868getCEK5gGoQ())) {
                        m4428equalsimpl0 = true;
                    } else {
                        m4428equalsimpl0 = Key.m4428equalsimpl0(m4736getKeyZmokQxo, mappedKeys.m878getInsertEK5gGoQ());
                    }
                    if (m4428equalsimpl0) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m4428equalsimpl0(m4736getKeyZmokQxo, mappedKeys.m885getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m4428equalsimpl0(m4736getKeyZmokQxo, mappedKeys.m886getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m4428equalsimpl0(m4736getKeyZmokQxo, mappedKeys.m865getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m4428equalsimpl0(m4736getKeyZmokQxo, mappedKeys.m887getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (!Key.m4428equalsimpl0(m4736getKeyZmokQxo, mappedKeys.m888getZEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.UNDO;
                }
                if (KeyEvent_androidKt.m4740isCtrlPressedZmokQxo(keyEvent)) {
                    return null;
                }
                if (KeyEvent_androidKt.m4742isShiftPressedZmokQxo(keyEvent)) {
                    long m4736getKeyZmokQxo2 = KeyEvent_androidKt.m4736getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m4428equalsimpl0(m4736getKeyZmokQxo2, mappedKeys2.m873getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m4428equalsimpl0(m4736getKeyZmokQxo2, mappedKeys2.m874getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m4428equalsimpl0(m4736getKeyZmokQxo2, mappedKeys2.m875getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m4428equalsimpl0(m4736getKeyZmokQxo2, mappedKeys2.m872getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m4428equalsimpl0(m4736getKeyZmokQxo2, mappedKeys2.m882getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m4428equalsimpl0(m4736getKeyZmokQxo2, mappedKeys2.m881getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m4428equalsimpl0(m4736getKeyZmokQxo2, mappedKeys2.m880getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m4428equalsimpl0(m4736getKeyZmokQxo2, mappedKeys2.m879getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (!Key.m4428equalsimpl0(m4736getKeyZmokQxo2, mappedKeys2.m878getInsertEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.PASTE;
                }
                long m4736getKeyZmokQxo3 = KeyEvent_androidKt.m4736getKeyZmokQxo(keyEvent);
                MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                if (Key.m4428equalsimpl0(m4736getKeyZmokQxo3, mappedKeys3.m873getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m4428equalsimpl0(m4736getKeyZmokQxo3, mappedKeys3.m874getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m4428equalsimpl0(m4736getKeyZmokQxo3, mappedKeys3.m875getDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m4428equalsimpl0(m4736getKeyZmokQxo3, mappedKeys3.m872getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m4428equalsimpl0(m4736getKeyZmokQxo3, mappedKeys3.m882getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m4428equalsimpl0(m4736getKeyZmokQxo3, mappedKeys3.m881getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m4428equalsimpl0(m4736getKeyZmokQxo3, mappedKeys3.m880getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m4428equalsimpl0(m4736getKeyZmokQxo3, mappedKeys3.m879getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m4428equalsimpl0(m4736getKeyZmokQxo3, mappedKeys3.m876getEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m4428equalsimpl0(m4736getKeyZmokQxo3, mappedKeys3.m867getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m4428equalsimpl0(m4736getKeyZmokQxo3, mappedKeys3.m871getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m4428equalsimpl0(m4736getKeyZmokQxo3, mappedKeys3.m883getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m4428equalsimpl0(m4736getKeyZmokQxo3, mappedKeys3.m870getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m4428equalsimpl0(m4736getKeyZmokQxo3, mappedKeys3.m869getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (!Key.m4428equalsimpl0(m4736getKeyZmokQxo3, mappedKeys3.m884getTabEK5gGoQ())) {
                    return null;
                }
                return KeyCommand.TAB;
            }
        };
    }

    @l
    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }
}
