.class public interface abstract annotation Landroidx/room/Relation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Landroidx/room/Relation;
        associateBy = .subannotation Landroidx/room/Junction;
            value = Ljava/lang/Object;
        .end subannotation
        entity = Ljava/lang/Object;
        projection = {}
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->CLASS:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->FIELD:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0003\u0008\u0087\u0002\u0018\u00002\u00020\u0001B8\u0012\u000c\u0008\u0002\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000cR\u0015\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u00028\u0006\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0008\u001a\u00020\u00058\u0006\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0007R\u0011\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000c8\u0006\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroidx/room/Relation;",
        "",
        "Lkotlin/reflect/d;",
        "entity",
        "()Ljava/lang/Class;",
        "",
        "parentColumn",
        "()Ljava/lang/String;",
        "entityColumn",
        "Landroidx/room/Junction;",
        "associateBy",
        "()Landroidx/room/Junction;",
        "",
        "projection",
        "()[Ljava/lang/String;",
        "room-common"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Ln3/e;
    value = .enum Ln3/a;->BINARY:Ln3/a;
.end annotation

.annotation runtime Ln3/f;
    allowedTargets = {
        .enum Ln3/b;->FIELD:Ln3/b;,
        .enum Ln3/b;->FUNCTION:Ln3/b;
    }
.end annotation


# virtual methods
.method public abstract associateBy()Landroidx/room/Junction;
.end method

.method public abstract entity()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

.method public abstract entityColumn()Ljava/lang/String;
.end method

.method public abstract parentColumn()Ljava/lang/String;
.end method

.method public abstract projection()[Ljava/lang/String;
.end method
