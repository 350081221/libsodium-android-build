.class public final Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$2$textInputSession$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/text2/input/internal/TextInputSession;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00042\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u00a2\u0006\u0002\u0008\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0008H\u0016J\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0014"
    }
    d2 = {
        "androidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$2$textInputSession$1",
        "Landroidx/compose/foundation/text2/input/internal/TextInputSession;",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/text2/input/internal/EditingBuffer;",
        "Lkotlin/r2;",
        "Lkotlin/u;",
        "block",
        "requestEdit",
        "Landroid/view/KeyEvent;",
        "keyEvent",
        "sendKeyEvent",
        "Landroidx/compose/ui/text/input/ImeAction;",
        "imeAction",
        "onImeAction-KlQnJC8",
        "(I)V",
        "onImeAction",
        "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "getText",
        "()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "text",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nAndroidTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextInputSession.android.kt\nandroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$2$textInputSession$1\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text2/input/internal/TransformedTextFieldState\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n*L\n1#1,208:1\n201#2,2:209\n206#2:231\n186#3,20:211\n*S KotlinDebug\n*F\n+ 1 AndroidTextInputSession.android.kt\nandroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$2$textInputSession$1\n*L\n81#1:209,2\n81#1:231\n81#1:211,20\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $composeImm:Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;

.field final synthetic $onImeAction:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/ui/text/input/ImeAction;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;Lv3/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;",
            "Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/text/input/ImeAction;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$2$textInputSession$1;->$state:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$2$textInputSession$1;->$composeImm:Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$2$textInputSession$1;->$onImeAction:Lv3/l;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method


# virtual methods
.method public getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$2$textInputSession$1;->$state:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    move-result-object v0

    return-object v0
.end method

.method public onImeAction-KlQnJC8(I)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$2$textInputSession$1;->$onImeAction:Lv3/l;

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroidx/compose/ui/text/input/ImeAction;->box-impl(I)Landroidx/compose/ui/text/input/ImeAction;

    move-result-object p1

    invoke-interface {v0, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public requestEdit(Lv3/l;)V
    .locals 8
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/foundation/text2/input/internal/EditingBuffer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$2$textInputSession$1;->$state:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;)Landroidx/compose/foundation/text2/input/TextFieldState;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->access$getInputTransformation$p(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;)Landroidx/compose/foundation/text2/input/InputTransformation;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v2, Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;->MergeIfPossible:Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->clearChanges()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-interface {p1, v4}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->getChangeCount()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-nez p1, :cond_0

    .line 48
    .line 49
    invoke-interface {v3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 50
    .line 51
    .line 52
    move-result-wide v4

    .line 53
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 58
    .line 59
    .line 60
    move-result-wide v6

    .line 61
    invoke-static {v4, v5, v6, v7}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_0

    .line 66
    .line 67
    invoke-interface {v3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-static {p1, v4}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_0

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    const/4 p1, 0x0

    .line 87
    invoke-static {v1, v3, v0, p1, v2}, Landroidx/compose/foundation/text2/input/TextFieldState;->access$commitEditAsUser(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/InputTransformation;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 88
    .line 89
    .line 90
    :goto_0
    return-void
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public sendKeyEvent(Landroid/view/KeyEvent;)V
    .locals 1
    .param p1    # Landroid/view/KeyEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$2$textInputSession$1;->$composeImm:Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;

    invoke-interface {v0, p1}, Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;->sendKeyEvent(Landroid/view/KeyEvent;)V

    return-void
.end method
