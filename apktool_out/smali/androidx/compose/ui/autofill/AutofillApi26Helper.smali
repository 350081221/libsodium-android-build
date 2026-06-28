.class public final Landroidx/compose/ui/autofill/AutofillApi26Helper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1a
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\r\n\u0002\u0008\u0004\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ \u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J%\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012H\u0007\u00a8\u0006\u001d"
    }
    d2 = {
        "Landroidx/compose/ui/autofill/AutofillApi26Helper;",
        "",
        "Landroid/view/ViewStructure;",
        "structure",
        "Landroid/view/autofill/AutofillId;",
        "parent",
        "",
        "virtualId",
        "Lkotlin/r2;",
        "setAutofillId",
        "getAutofillId",
        "type",
        "setAutofillType",
        "",
        "",
        "hints",
        "setAutofillHints",
        "(Landroid/view/ViewStructure;[Ljava/lang/String;)V",
        "Landroid/view/autofill/AutofillValue;",
        "value",
        "",
        "isText",
        "isDate",
        "isList",
        "isToggle",
        "",
        "textValue",
        "<init>",
        "()V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Landroidx/compose/ui/autofill/AutofillApi26Helper;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/autofill/AutofillApi26Helper;

    invoke-direct {v0}, Landroidx/compose/ui/autofill/AutofillApi26Helper;-><init>()V

    sput-object v0, Landroidx/compose/ui/autofill/AutofillApi26Helper;->INSTANCE:Landroidx/compose/ui/autofill/AutofillApi26Helper;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getAutofillId(Landroid/view/ViewStructure;)Landroid/view/autofill/AutofillId;
    .locals 0
    .param p1    # Landroid/view/ViewStructure;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-static {p1}, Lb/j;->a(Landroid/view/ViewStructure;)Landroid/view/autofill/AutofillId;

    move-result-object p1

    return-object p1
.end method

.method public final isDate(Landroid/view/autofill/AutofillValue;)Z
    .locals 0
    .param p1    # Landroid/view/autofill/AutofillValue;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    invoke-static {p1}, Lb/g;->a(Landroid/view/autofill/AutofillValue;)Z

    move-result p1

    return p1
.end method

.method public final isList(Landroid/view/autofill/AutofillValue;)Z
    .locals 0
    .param p1    # Landroid/view/autofill/AutofillValue;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    invoke-static {p1}, Lb/f;->a(Landroid/view/autofill/AutofillValue;)Z

    move-result p1

    return p1
.end method

.method public final isText(Landroid/view/autofill/AutofillValue;)Z
    .locals 0
    .param p1    # Landroid/view/autofill/AutofillValue;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    invoke-static {p1}, Lb/d;->a(Landroid/view/autofill/AutofillValue;)Z

    move-result p1

    return p1
.end method

.method public final isToggle(Landroid/view/autofill/AutofillValue;)Z
    .locals 0
    .param p1    # Landroid/view/autofill/AutofillValue;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    invoke-static {p1}, Lb/l;->a(Landroid/view/autofill/AutofillValue;)Z

    move-result p1

    return p1
.end method

.method public final setAutofillHints(Landroid/view/ViewStructure;[Ljava/lang/String;)V
    .locals 0
    .param p1    # Landroid/view/ViewStructure;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # [Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    invoke-static {p1, p2}, Lb/h;->a(Landroid/view/ViewStructure;[Ljava/lang/String;)V

    return-void
.end method

.method public final setAutofillId(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillId;I)V
    .locals 0
    .param p1    # Landroid/view/ViewStructure;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/view/autofill/AutofillId;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    invoke-static {p1, p2, p3}, Lb/e;->a(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillId;I)V

    return-void
.end method

.method public final setAutofillType(Landroid/view/ViewStructure;I)V
    .locals 0
    .param p1    # Landroid/view/ViewStructure;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    invoke-static {p1, p2}, Lb/k;->a(Landroid/view/ViewStructure;I)V

    return-void
.end method

.method public final textValue(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;
    .locals 0
    .param p1    # Landroid/view/autofill/AutofillValue;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p1}, Lb/i;->a(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
