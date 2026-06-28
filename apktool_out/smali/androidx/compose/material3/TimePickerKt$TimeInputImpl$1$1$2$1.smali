.class final Landroidx/compose/material3/TimePickerKt$TimeInputImpl$1$1$2$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/TimePickerKt$TimeInputImpl$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/text/input/TextFieldValue;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/compose/ui/text/input/TextFieldValue;",
        "newValue",
        "Lkotlin/r2;",
        "invoke",
        "(Landroidx/compose/ui/text/input/TextFieldValue;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $hourValue$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Landroidx/compose/material3/TimePickerState;


# direct methods
.method constructor <init>(Landroidx/compose/material3/TimePickerState;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/TimePickerState;",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/TimePickerKt$TimeInputImpl$1$1$2$1;->$state:Landroidx/compose/material3/TimePickerState;

    iput-object p2, p0, Landroidx/compose/material3/TimePickerKt$TimeInputImpl$1$1$2$1;->$hourValue$delegate:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/text/input/TextFieldValue;

    invoke-virtual {p0, p1}, Landroidx/compose/material3/TimePickerKt$TimeInputImpl$1$1$2$1;->invoke(Landroidx/compose/ui/text/input/TextFieldValue;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/text/input/TextFieldValue;)V
    .locals 7
    .param p1    # Landroidx/compose/ui/text/input/TextFieldValue;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    sget-object v0, Landroidx/compose/material3/Selection;->Companion:Landroidx/compose/material3/Selection$Companion;

    invoke-virtual {v0}, Landroidx/compose/material3/Selection$Companion;->getHour-JiIwxys()I

    move-result v1

    .line 3
    iget-object v2, p0, Landroidx/compose/material3/TimePickerKt$TimeInputImpl$1$1$2$1;->$state:Landroidx/compose/material3/TimePickerState;

    .line 4
    iget-object v0, p0, Landroidx/compose/material3/TimePickerKt$TimeInputImpl$1$1$2$1;->$hourValue$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0}, Landroidx/compose/material3/TimePickerKt;->access$TimeInputImpl$lambda$5(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/input/TextFieldValue;

    move-result-object v4

    .line 5
    iget-object v0, p0, Landroidx/compose/material3/TimePickerKt$TimeInputImpl$1$1$2$1;->$state:Landroidx/compose/material3/TimePickerState;

    invoke-virtual {v0}, Landroidx/compose/material3/TimePickerState;->is24hour()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x17

    goto :goto_0

    :cond_0
    const/16 v0, 0xc

    :goto_0
    move v5, v0

    .line 6
    new-instance v6, Landroidx/compose/material3/TimePickerKt$TimeInputImpl$1$1$2$1$1;

    iget-object v0, p0, Landroidx/compose/material3/TimePickerKt$TimeInputImpl$1$1$2$1;->$hourValue$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {v6, v0}, Landroidx/compose/material3/TimePickerKt$TimeInputImpl$1$1$2$1$1;-><init>(Landroidx/compose/runtime/MutableState;)V

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Landroidx/compose/material3/TimePickerKt;->access$timeInputOnChange-gIWD5Rc(ILandroidx/compose/material3/TimePickerState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;ILv3/l;)V

    return-void
.end method
