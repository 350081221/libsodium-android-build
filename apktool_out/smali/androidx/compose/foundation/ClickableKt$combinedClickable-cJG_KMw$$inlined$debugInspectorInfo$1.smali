.class public final Landroidx/compose/foundation/ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/ClickableKt;->combinedClickable-cJG_KMw(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lv3/a;Lv3/a;Lv3/a;)Landroidx/compose/ui/Modifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/platform/InspectorInfo;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Landroidx/compose/ui/platform/InspectorInfo;",
        "Lkotlin/r2;",
        "invoke",
        "(Landroidx/compose/ui/platform/InspectorInfo;)V",
        "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,170:1\n195#2,9:171\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $enabled$inlined:Z

.field final synthetic $onClick$inlined:Lv3/a;

.field final synthetic $onClickLabel$inlined:Ljava/lang/String;

.field final synthetic $onDoubleClick$inlined:Lv3/a;

.field final synthetic $onLongClick$inlined:Lv3/a;

.field final synthetic $onLongClickLabel$inlined:Ljava/lang/String;

.field final synthetic $role$inlined:Landroidx/compose/ui/semantics/Role;


# direct methods
.method public constructor <init>(ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lv3/a;Lv3/a;Lv3/a;Ljava/lang/String;)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1;->$enabled$inlined:Z

    iput-object p2, p0, Landroidx/compose/foundation/ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1;->$onClickLabel$inlined:Ljava/lang/String;

    iput-object p3, p0, Landroidx/compose/foundation/ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1;->$role$inlined:Landroidx/compose/ui/semantics/Role;

    iput-object p4, p0, Landroidx/compose/foundation/ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1;->$onClick$inlined:Lv3/a;

    iput-object p5, p0, Landroidx/compose/foundation/ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1;->$onDoubleClick$inlined:Lv3/a;

    iput-object p6, p0, Landroidx/compose/foundation/ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1;->$onLongClick$inlined:Lv3/a;

    iput-object p7, p0, Landroidx/compose/foundation/ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1;->$onLongClickLabel$inlined:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/platform/InspectorInfo;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1;->invoke(Landroidx/compose/ui/platform/InspectorInfo;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/platform/InspectorInfo;)V
    .locals 3
    .param p1    # Landroidx/compose/ui/platform/InspectorInfo;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "combinedClickable"

    .line 2
    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/InspectorInfo;->setName(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    move-result-object v0

    iget-boolean v1, p0, Landroidx/compose/foundation/ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1;->$enabled$inlined:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "enabled"

    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    move-result-object v0

    const-string v1, "onClickLabel"

    iget-object v2, p0, Landroidx/compose/foundation/ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1;->$onClickLabel$inlined:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 5
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    move-result-object v0

    const-string v1, "role"

    iget-object v2, p0, Landroidx/compose/foundation/ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1;->$role$inlined:Landroidx/compose/ui/semantics/Role;

    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    move-result-object v0

    const-string v1, "onClick"

    iget-object v2, p0, Landroidx/compose/foundation/ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1;->$onClick$inlined:Lv3/a;

    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 7
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    move-result-object v0

    const-string v1, "onDoubleClick"

    iget-object v2, p0, Landroidx/compose/foundation/ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1;->$onDoubleClick$inlined:Lv3/a;

    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    move-result-object v0

    const-string v1, "onLongClick"

    iget-object v2, p0, Landroidx/compose/foundation/ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1;->$onLongClick$inlined:Lv3/a;

    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    move-result-object p1

    const-string v0, "onLongClickLabel"

    iget-object v1, p0, Landroidx/compose/foundation/ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1;->$onLongClickLabel$inlined:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
