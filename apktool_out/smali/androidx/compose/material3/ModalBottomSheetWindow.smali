.class final Landroidx/compose/material3/ModalBottomSheetWindow;
.super Landroidx/compose/ui/platform/AbstractComposeView;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroidx/compose/ui/platform/ViewRootForInspector;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/material3/ModalBottomSheetWindow$Api33Impl;,
        Landroidx/compose/material3/ModalBottomSheetWindow$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001AB-\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010>\u001a\u00020=\u00a2\u0006\u0004\u0008?\u0010@J\u0008\u0010\u0005\u001a\u00020\u0004H\u0002J\u0008\u0010\u0006\u001a\u00020\u0004H\u0002J\u000f\u0010\u0007\u001a\u00020\u0004H\u0017\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J,\u0010\u000e\u001a\u00020\u00042\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00040\u000b\u00a2\u0006\u0002\u0008\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0004J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0008\u0010\u0016\u001a\u00020\u0004H\u0014J\u0008\u0010\u0017\u001a\u00020\u0004H\u0014J\u0008\u0010\u0018\u001a\u00020\u0004H\u0016J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u001c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0018\u0010\'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.RA\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00040\u000b\u00a2\u0006\u0002\u0008\u000c2\u0011\u0010/\u001a\r\u0012\u0004\u0012\u00020\u00040\u000b\u00a2\u0006\u0002\u0008\u000c8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103\"\u0004\u00084\u00105R$\u00106\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u00148\u0014@RX\u0094\u000e\u00a2\u0006\u000c\n\u0004\u00086\u00107\u001a\u0004\u00088\u00109R\u0014\u0010<\u001a\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008:\u0010;\u00a8\u0006B"
    }
    d2 = {
        "Landroidx/compose/material3/ModalBottomSheetWindow;",
        "Landroidx/compose/ui/platform/AbstractComposeView;",
        "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;",
        "Landroidx/compose/ui/platform/ViewRootForInspector;",
        "Lkotlin/r2;",
        "maybeRegisterBackCallback",
        "maybeUnregisterBackCallback",
        "Content",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/runtime/CompositionContext;",
        "parent",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "content",
        "setCustomContent",
        "(Landroidx/compose/runtime/CompositionContext;Lv3/p;)V",
        "show",
        "dismiss",
        "Landroid/view/KeyEvent;",
        "event",
        "",
        "dispatchKeyEvent",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "onGlobalLayout",
        "",
        "layoutDirection",
        "setLayoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "superSetLayoutDirection",
        "Landroidx/compose/material3/ModalBottomSheetProperties;",
        "properties",
        "Landroidx/compose/material3/ModalBottomSheetProperties;",
        "onDismissRequest",
        "Lv3/a;",
        "Landroid/view/View;",
        "composeView",
        "Landroid/view/View;",
        "",
        "backCallback",
        "Ljava/lang/Object;",
        "Landroid/view/WindowManager;",
        "windowManager",
        "Landroid/view/WindowManager;",
        "Landroid/view/WindowManager$LayoutParams;",
        "params",
        "Landroid/view/WindowManager$LayoutParams;",
        "<set-?>",
        "content$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "getContent",
        "()Lv3/p;",
        "setContent",
        "(Lv3/p;)V",
        "shouldCreateCompositionOnAttachedToWindow",
        "Z",
        "getShouldCreateCompositionOnAttachedToWindow",
        "()Z",
        "getDisplayWidth",
        "()I",
        "displayWidth",
        "Ljava/util/UUID;",
        "saveId",
        "<init>",
        "(Landroidx/compose/material3/ModalBottomSheetProperties;Lv3/a;Landroid/view/View;Ljava/util/UUID;)V",
        "Api33Impl",
        "material3_release"
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
        "SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheetWindow\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,702:1\n81#2:703\n107#2,2:704\n1#3:706\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheetWindow\n*L\n557#1:703\n557#1:704,2\n*E\n"
    }
.end annotation


# instance fields
.field private backCallback:Ljava/lang/Object;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final composeView:Landroid/view/View;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final content$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private onDismissRequest:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final params:Landroid/view/WindowManager$LayoutParams;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final properties:Landroidx/compose/material3/ModalBottomSheetProperties;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private shouldCreateCompositionOnAttachedToWindow:Z

.field private final windowManager:Landroid/view/WindowManager;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/material3/ModalBottomSheetProperties;Lv3/a;Landroid/view/View;Ljava/util/UUID;)V
    .locals 6
    .param p1    # Landroidx/compose/material3/ModalBottomSheetProperties;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Ljava/util/UUID;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/ModalBottomSheetProperties;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Landroid/view/View;",
            "Ljava/util/UUID;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x6

    .line 8
    const/4 v5, 0x0

    .line 9
    move-object v0, p0

    .line 10
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/AbstractComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/w;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Landroidx/compose/material3/ModalBottomSheetWindow;->properties:Landroidx/compose/material3/ModalBottomSheetProperties;

    .line 14
    .line 15
    iput-object p2, p0, Landroidx/compose/material3/ModalBottomSheetWindow;->onDismissRequest:Lv3/a;

    .line 16
    .line 17
    iput-object p3, p0, Landroidx/compose/material3/ModalBottomSheetWindow;->composeView:Landroid/view/View;

    .line 18
    .line 19
    const p2, 0x1020002

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p2}, Landroid/view/View;->setId(I)V

    .line 23
    .line 24
    .line 25
    invoke-static {p3}, Landroidx/lifecycle/ViewTreeLifecycleOwner;->get(Landroid/view/View;)Landroidx/lifecycle/LifecycleOwner;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-static {p0, p2}, Landroidx/lifecycle/ViewTreeLifecycleOwner;->set(Landroid/view/View;Landroidx/lifecycle/LifecycleOwner;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p3}, Landroidx/lifecycle/ViewTreeViewModelStoreOwner;->get(Landroid/view/View;)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-static {p0, p2}, Landroidx/lifecycle/ViewTreeViewModelStoreOwner;->set(Landroid/view/View;Landroidx/lifecycle/ViewModelStoreOwner;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p3}, Landroidx/savedstate/ViewTreeSavedStateRegistryOwner;->get(Landroid/view/View;)Landroidx/savedstate/SavedStateRegistryOwner;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-static {p0, p2}, Landroidx/savedstate/ViewTreeSavedStateRegistryOwner;->set(Landroid/view/View;Landroidx/savedstate/SavedStateRegistryOwner;)V

    .line 44
    .line 45
    .line 46
    sget p2, Landroidx/compose/ui/R$id;->compose_view_saveable_id_tag:I

    .line 47
    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v1, "Popup:"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p4

    .line 65
    invoke-virtual {p0, p2, p4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    const/4 p2, 0x0

    .line 69
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    const-string/jumbo p4, "window"

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, p4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    const-string p4, "null cannot be cast to non-null type android.view.WindowManager"

    .line 84
    .line 85
    invoke-static {p2, p4}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    check-cast p2, Landroid/view/WindowManager;

    .line 89
    .line 90
    iput-object p2, p0, Landroidx/compose/material3/ModalBottomSheetWindow;->windowManager:Landroid/view/WindowManager;

    .line 91
    .line 92
    new-instance p2, Landroid/view/WindowManager$LayoutParams;

    .line 93
    .line 94
    invoke-direct {p2}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 95
    .line 96
    .line 97
    const p4, 0x800053

    .line 98
    .line 99
    .line 100
    iput p4, p2, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 101
    .line 102
    const/16 p4, 0x3e8

    .line 103
    .line 104
    iput p4, p2, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 105
    .line 106
    invoke-direct {p0}, Landroidx/compose/material3/ModalBottomSheetWindow;->getDisplayWidth()I

    .line 107
    .line 108
    .line 109
    move-result p4

    .line 110
    iput p4, p2, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 111
    .line 112
    const/4 p4, -0x1

    .line 113
    iput p4, p2, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 114
    .line 115
    const/4 p4, -0x3

    .line 116
    iput p4, p2, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 117
    .line 118
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 119
    .line 120
    .line 121
    move-result-object p4

    .line 122
    invoke-virtual {p4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 123
    .line 124
    .line 125
    move-result-object p4

    .line 126
    sget v0, Landroidx/compose/ui/R$string;->default_popup_window_title:I

    .line 127
    .line 128
    invoke-virtual {p4, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p4

    .line 132
    invoke-virtual {p2, p4}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p3}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    .line 136
    .line 137
    .line 138
    move-result-object p4

    .line 139
    iput-object p4, p2, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    .line 140
    .line 141
    iget p4, p2, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 142
    .line 143
    const v0, -0x28001

    .line 144
    .line 145
    .line 146
    and-int/2addr p4, v0

    .line 147
    or-int/lit16 p4, p4, 0x200

    .line 148
    .line 149
    iput p4, p2, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 150
    .line 151
    invoke-virtual {p1}, Landroidx/compose/material3/ModalBottomSheetProperties;->getSecurePolicy()Landroidx/compose/ui/window/SecureFlagPolicy;

    .line 152
    .line 153
    .line 154
    move-result-object p4

    .line 155
    invoke-static {p3}, Landroidx/compose/material3/ModalBottomSheet_androidKt;->access$isFlagSecureEnabled(Landroid/view/View;)Z

    .line 156
    .line 157
    .line 158
    move-result p3

    .line 159
    invoke-static {p4, p3}, Landroidx/compose/material3/ModalBottomSheet_androidKt;->access$shouldApplySecureFlag(Landroidx/compose/ui/window/SecureFlagPolicy;Z)Z

    .line 160
    .line 161
    .line 162
    move-result p3

    .line 163
    if-eqz p3, :cond_0

    .line 164
    .line 165
    iget p3, p2, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 166
    .line 167
    or-int/lit16 p3, p3, 0x2000

    .line 168
    .line 169
    iput p3, p2, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_0
    iget p3, p2, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 173
    .line 174
    and-int/lit16 p3, p3, -0x2001

    .line 175
    .line 176
    iput p3, p2, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 177
    .line 178
    :goto_0
    invoke-virtual {p1}, Landroidx/compose/material3/ModalBottomSheetProperties;->isFocusable()Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    if-nez p1, :cond_1

    .line 183
    .line 184
    iget p1, p2, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 185
    .line 186
    or-int/lit8 p1, p1, 0x8

    .line 187
    .line 188
    iput p1, p2, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_1
    iget p1, p2, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 192
    .line 193
    and-int/lit8 p1, p1, -0x9

    .line 194
    .line 195
    iput p1, p2, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 196
    .line 197
    :goto_1
    iput-object p2, p0, Landroidx/compose/material3/ModalBottomSheetWindow;->params:Landroid/view/WindowManager$LayoutParams;

    .line 198
    .line 199
    sget-object p1, Landroidx/compose/material3/ComposableSingletons$ModalBottomSheet_androidKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$ModalBottomSheet_androidKt;

    .line 200
    .line 201
    invoke-virtual {p1}, Landroidx/compose/material3/ComposableSingletons$ModalBottomSheet_androidKt;->getLambda-2$material3_release()Lv3/p;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    const/4 p2, 0x2

    .line 206
    const/4 p3, 0x0

    .line 207
    invoke-static {p1, p3, p2, p3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    iput-object p1, p0, Landroidx/compose/material3/ModalBottomSheetWindow;->content$delegate:Landroidx/compose/runtime/MutableState;

    .line 212
    .line 213
    return-void
    .line 214
.end method

.method private final getContent()Lv3/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/p<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/material3/ModalBottomSheetWindow;->content$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lv3/p;

    .line 8
    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method private final getDisplayWidth()I
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    return v0
.end method

.method private final maybeRegisterBackCallback()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/material3/ModalBottomSheetWindow;->properties:Landroidx/compose/material3/ModalBottomSheetProperties;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/material3/ModalBottomSheetProperties;->getShouldDismissOnBackPress()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v1, 0x21

    .line 12
    .line 13
    if-ge v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Landroidx/compose/material3/ModalBottomSheetWindow;->backCallback:Ljava/lang/Object;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/compose/material3/ModalBottomSheetWindow;->onDismissRequest:Lv3/a;

    .line 21
    .line 22
    invoke-static {v0}, Landroidx/compose/material3/ModalBottomSheetWindow$Api33Impl;->createBackCallback(Lv3/a;)Landroid/window/OnBackInvokedCallback;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Landroidx/compose/material3/ModalBottomSheetWindow;->backCallback:Ljava/lang/Object;

    .line 27
    .line 28
    :cond_1
    iget-object v0, p0, Landroidx/compose/material3/ModalBottomSheetWindow;->backCallback:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-static {p0, v0}, Landroidx/compose/material3/ModalBottomSheetWindow$Api33Impl;->maybeRegisterBackCallback(Landroid/view/View;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    :goto_0
    return-void
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
.end method

.method private final maybeUnregisterBackCallback()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/compose/material3/ModalBottomSheetWindow;->backCallback:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p0, v0}, Landroidx/compose/material3/ModalBottomSheetWindow$Api33Impl;->maybeUnregisterBackCallback(Landroid/view/View;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Landroidx/compose/material3/ModalBottomSheetWindow;->backCallback:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method private final setContent(Lv3/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/material3/ModalBottomSheetWindow;->content$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
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
.end method

.method public static synthetic setCustomContent$default(Landroidx/compose/material3/ModalBottomSheetWindow;Landroidx/compose/runtime/CompositionContext;Lv3/p;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/ModalBottomSheetWindow;->setCustomContent(Landroidx/compose/runtime/CompositionContext;Lv3/p;)V

    return-void
.end method


# virtual methods
.method public Content(Landroidx/compose/runtime/Composer;I)V
    .locals 4
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    const v0, -0x1b9d8b83

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    and-int/lit8 v1, p2, 0x6

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v2

    .line 22
    :goto_0
    or-int/2addr v1, p2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v1, p2

    .line 25
    :goto_1
    and-int/lit8 v3, v1, 0x3

    .line 26
    .line 27
    if-ne v3, v2, :cond_3

    .line 28
    .line 29
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 37
    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_3
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_4

    .line 45
    .line 46
    const/4 v2, -0x1

    .line 47
    const-string v3, "androidx.compose.material3.ModalBottomSheetWindow.Content (ModalBottomSheet.android.kt:562)"

    .line 48
    .line 49
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_4
    invoke-direct {p0}, Landroidx/compose/material3/ModalBottomSheetWindow;->getContent()Lv3/p;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const/4 v1, 0x0

    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-interface {v0, p1, v1}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_5

    .line 69
    .line 70
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 71
    .line 72
    .line 73
    :cond_5
    :goto_3
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-eqz p1, :cond_6

    .line 78
    .line 79
    new-instance v0, Landroidx/compose/material3/ModalBottomSheetWindow$Content$4;

    .line 80
    .line 81
    invoke-direct {v0, p0, p2}, Landroidx/compose/material3/ModalBottomSheetWindow$Content$4;-><init>(Landroidx/compose/material3/ModalBottomSheetWindow;I)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 85
    .line 86
    .line 87
    :cond_6
    return-void
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
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
.end method

.method public final dismiss()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Landroidx/lifecycle/ViewTreeLifecycleOwner;->set(Landroid/view/View;Landroidx/lifecycle/LifecycleOwner;)V

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Landroidx/savedstate/ViewTreeSavedStateRegistryOwner;->set(Landroid/view/View;Landroidx/savedstate/SavedStateRegistryOwner;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/compose/material3/ModalBottomSheetWindow;->composeView:Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Landroidx/compose/material3/ModalBottomSheetWindow;->windowManager:Landroid/view/WindowManager;

    .line 18
    .line 19
    invoke-interface {v0, p0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    return-void
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
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2
    .param p1    # Landroid/view/KeyEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    if-ne v0, v1, :cond_3

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/compose/material3/ModalBottomSheetWindow;->properties:Landroidx/compose/material3/ModalBottomSheetProperties;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/material3/ModalBottomSheetProperties;->getShouldDismissOnBackPress()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v1, 0x1

    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0, p1, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    return v1

    .line 50
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-ne v0, v1, :cond_3

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Landroid/view/KeyEvent$DispatcherState;->isTracking(Landroid/view/KeyEvent;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCanceled()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_3

    .line 73
    .line 74
    iget-object p1, p0, Landroidx/compose/material3/ModalBottomSheetWindow;->onDismissRequest:Lv3/a;

    .line 75
    .line 76
    invoke-interface {p1}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    return v1

    .line 80
    :cond_3
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    return p1
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
.end method

.method protected getShouldCreateCompositionOnAttachedToWindow()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/material3/ModalBottomSheetWindow;->shouldCreateCompositionOnAttachedToWindow:Z

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/compose/material3/ModalBottomSheetWindow;->maybeRegisterBackCallback()V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/compose/material3/ModalBottomSheetWindow;->maybeUnregisterBackCallback()V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public onGlobalLayout()V
    .locals 0

    return-void
.end method

.method public final setCustomContent(Landroidx/compose/runtime/CompositionContext;Lv3/p;)V
    .locals 0
    .param p1    # Landroidx/compose/runtime/CompositionContext;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/CompositionContext;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AbstractComposeView;->setParentCompositionContext(Landroidx/compose/runtime/CompositionContext;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-direct {p0, p2}, Landroidx/compose/material3/ModalBottomSheetWindow;->setContent(Lv3/p;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Landroidx/compose/material3/ModalBottomSheetWindow;->shouldCreateCompositionOnAttachedToWindow:Z

    .line 11
    .line 12
    return-void
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
.end method

.method public setLayoutDirection(I)V
    .locals 0

    return-void
.end method

.method public final show()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/material3/ModalBottomSheetWindow;->windowManager:Landroid/view/WindowManager;

    iget-object v1, p0, Landroidx/compose/material3/ModalBottomSheetWindow;->params:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, p0, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final superSetLayoutDirection(Landroidx/compose/ui/unit/LayoutDirection;)V
    .locals 2
    .param p1    # Landroidx/compose/ui/unit/LayoutDirection;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    sget-object v0, Landroidx/compose/material3/ModalBottomSheetWindow$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-ne p1, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Lkotlin/j0;

    .line 17
    .line 18
    invoke-direct {p1}, Lkotlin/j0;-><init>()V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    :goto_0
    invoke-super {p0, v0}, Landroid/view/View;->setLayoutDirection(I)V

    .line 24
    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method
